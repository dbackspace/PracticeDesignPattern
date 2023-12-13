package in_myfiles.other_pattern.intercepting_filter

class VerifyHiddenFileFilter : FileFilter {
    override fun execute(fileRequest: FileRequest) {
        // Remove hidden files
        fileRequest.listFileInfo.removeIf { it.isHidden }
    }
}