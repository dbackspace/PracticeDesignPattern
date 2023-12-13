package in_myfiles.creational_pattern.factory_method

object FileInfoDataSource {
    fun getListFileInfo(): MutableList<FileInfo> {
        return mutableListOf(
            FileInfo("image", "jpg", 1000, 900),
            FileInfo("audio", "m4a", 950, 1940),
            FileInfo("video", "mpeg", 1200, 1500),
            FileInfo("document", "xlsx", 1110, 1200),
            FileInfo("installation", "apk", 1300, 1000)
        )
    }
}