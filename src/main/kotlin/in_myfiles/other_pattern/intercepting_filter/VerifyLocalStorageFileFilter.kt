package in_myfiles.other_pattern.intercepting_filter

class VerifyLocalStorageFileFilter : FileFilter {
    companion object {
        const val PREFIX_LOCAL_STORAGE = "storage/emulated/0/"
    }
    override fun execute(fileRequest: FileRequest) {
        // Remove files has prefix from PREFIX_LOCAL_STORAGE
        fileRequest.listFileInfo.removeIf { it.path.contains(PREFIX_LOCAL_STORAGE) }
    }
}