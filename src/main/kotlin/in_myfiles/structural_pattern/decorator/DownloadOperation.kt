package in_myfiles.structural_pattern.decorator

class DownloadOperation(decorator: IFileOperation?) : DecoratorOperation(decorator) {
    override fun doExtraOperation(): String {
        return "Download operation"
    }
}