package in_myfiles.other_pattern.repository

data class SearchFileInfo(
    private var fileId: String,
    private var path: String
) : FileInfo {
    override fun getFileId(): String {
        return fileId
    }

    override fun getPath(): String {
        return path
    }

    override fun toString(): String {
        return "fileId = $fileId, path = $path"
    }
}