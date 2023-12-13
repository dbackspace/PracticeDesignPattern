package in_myfiles.behavioral_pattern.facade_and_command_and_observer

class ExecuteDelete : AbsExecute() {
    override fun onExecute(menuType: Int, executable: IExecutable): Boolean {
        println("Execute Delete: completed")
        val result = FileOperationResult(
            menuType = menuType,
            isCancelled = true,
            needRefresh = true
        )
        executable.onResult(result)
        return true
    }
}