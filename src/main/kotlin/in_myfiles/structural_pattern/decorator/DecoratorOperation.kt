package in_myfiles.structural_pattern.decorator

abstract class DecoratorOperation : IFileOperation {
    var decorator: IFileOperation? = null

    override fun doOperation(): String {
        return "${doExtraOperation()} -> ${decorator?.doOperation()}"
    }

    abstract fun doExtraOperation(): String
}