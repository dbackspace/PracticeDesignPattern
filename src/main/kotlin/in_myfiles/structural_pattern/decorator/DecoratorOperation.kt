package in_myfiles.structural_pattern.decorator

abstract class DecoratorOperation(val decorator: IFileOperation?) : IFileOperation {

    override fun doOperation(): String {
        return "${doExtraOperation()} -> ${decorator?.doOperation()}"
    }

    abstract fun doExtraOperation(): String
}