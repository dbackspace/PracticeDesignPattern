package in_myfiles.behavioral_pattern.facade_and_command_and_observer

typealias NotifyResultListener = (MenuExecuteResult) -> Unit
class FileListController : ResultListener {
    fun handleExecuteMenu(menuType: Int) {
        MenuExecuteManager.addDataCallbackListener(this)
        MenuExecuteManager().execute(menuType)
    }
    override fun onResult(result: MenuExecuteResult) {
        println("FileListController: notify successfully")
    }
}