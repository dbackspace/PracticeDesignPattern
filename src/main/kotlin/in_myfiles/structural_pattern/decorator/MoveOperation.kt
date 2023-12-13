package in_myfiles.structural_pattern.decorator

class MoveOperation : IFileOperation {
    override fun doOperation(): String {
        return "Move operation"
    }
}