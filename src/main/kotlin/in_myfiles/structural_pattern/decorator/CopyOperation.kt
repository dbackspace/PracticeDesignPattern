package in_myfiles.structural_pattern.decorator

class CopyOperation : IFileOperation {
    override fun doOperation(): String {
        return "Copy operation"
    }
}