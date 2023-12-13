package in_myfiles.behavioral_pattern.facade_and_command_and_observer

class ExecuteDefault : AbsExecute() {
    override fun onExecute(menuType: Int, executable: IExecutable): Boolean {
        println("Execute Default: completed")
        return true
    }
}