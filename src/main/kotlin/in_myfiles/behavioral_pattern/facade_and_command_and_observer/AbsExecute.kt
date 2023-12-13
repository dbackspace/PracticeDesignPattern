package in_myfiles.behavioral_pattern.facade_and_command_and_observer

// This is abstract command class
abstract class AbsExecute {
    abstract fun onExecute(menuType: Int, executable: IExecutable): Boolean
}