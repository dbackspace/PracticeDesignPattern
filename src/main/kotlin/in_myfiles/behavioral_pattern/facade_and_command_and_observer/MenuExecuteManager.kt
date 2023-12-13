package in_myfiles.behavioral_pattern.facade_and_command_and_observer

// This is Facade class
class MenuExecuteManager : IExecutable {
    private val executionMap = hashMapOf<Int, AbsExecute>()

    companion object {
        private val setOfCallbackListener = hashSetOf<ResultListener>()

        fun addDataCallbackListener(listener: ResultListener) {
            setOfCallbackListener.add(listener)
        }

        fun removeDataCallbackListener(listener: ResultListener) {
            setOfCallbackListener.remove(listener)
        }
    }

    init {
        executionMap[MenuType.COPY] = ExecuteCopy()
        executionMap[MenuType.MOVE] = ExecuteMove()
        executionMap[MenuType.DELETE] = ExecuteDelete()
    }

    private fun getExecution(menuType: Int): AbsExecute {
        return executionMap[menuType] ?: ExecuteDefault()
    }

    fun execute(menuType: Int): Boolean {
        val execute = getExecution(menuType)
        return execute.onExecute(menuType, this)
    }

    override fun onResult(result: FileOperationResult) {
        val menuResult = MenuExecuteResult(
            menuType = result.menuType,
            isSuccess = result.isSuccess,
            isCancelled = result.isCancelled,
            needRefresh = result.needRefresh
        )
        notifyResultListener(menuResult)
    }

    private fun needNotifyResult(result: MenuExecuteResult): Boolean {
        return (result.menuType != MenuType.UNDEFINED) && result.needRefresh
    }

    private fun notifyResultListener(menuResult: MenuExecuteResult) {
        setOfCallbackListener.forEach { listener ->
            if (needNotifyResult(menuResult)) {
                listener.onResult(menuResult)
            }
        }
    }
}