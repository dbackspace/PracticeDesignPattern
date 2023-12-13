package in_myfiles.other_pattern.repository

class SearchCloudDataSource : SearchInterface {
    override fun query(): List<SearchFileInfo> {
        return listOf(
            SearchFileInfo("2a", "Google_Drive/image.jpg"),
            SearchFileInfo("2b", "One_Drive/audio.m4a"),
            SearchFileInfo("2c", "Google_Drive/video.mpeg"),
            SearchFileInfo("2d", "One_Drive/document.xlsx"),
            SearchFileInfo("2e", "Google_Drive/installation.apk")
        )
    }
}