package in_myfiles.behavioral_pattern.facade_and_command_and_observer

class ExecuteMove : AbsExecute() {
    override fun onExecute(menuType: Int, executable: IExecutable): Boolean {
        println("Execute Move: completed")
        val result = FileOperationResult(
            menuType = menuType,
            needRefresh = true
        )
        executable.onResult(result)
        return true
    }
}