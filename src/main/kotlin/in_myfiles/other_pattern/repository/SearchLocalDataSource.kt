package in_myfiles.other_pattern.repository

class SearchLocalDataSource : SearchInterface {
    override fun query(): List<SearchFileInfo> {
        return listOf(
            SearchFileInfo("1a", "Internal_storage/image.jpg"),
            SearchFileInfo("1b", "SD_card/audio.m4a"),
            SearchFileInfo("1c", "Internal_storage/video.mpeg"),
            SearchFileInfo("1d", "SD_card/document.xlsx"),
            SearchFileInfo("1e", "Internal_storage/installation.apk")
        )
    }
}