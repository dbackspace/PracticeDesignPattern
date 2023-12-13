package in_myfiles.structural_pattern.decorator

class DownloadOperation : DecoratorOperation() {
    override fun doExtraOperation(): String {
        return "Download operation"
    }
}