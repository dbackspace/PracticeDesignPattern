package in_myfiles.behavioral_pattern.facade_and_command_and_observer

class ExecuteCopy : AbsExecute() {
    override fun onExecute(menuType: Int, executable: IExecutable): Boolean {
        println("Execute Copy: completed")
        val result = FileOperationResult(
            menuType = menuType,
            isSuccess = true
        )
        executable.onResult(result)
        return true
    }
}