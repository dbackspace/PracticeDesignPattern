package in_myfiles.structural_pattern.proxy

object CachedThumbnailDataSource {
    val cachedThumbnailMap = hashMapOf<String, String>()

    init {
        cachedThumbnailMap["/Google_Drive/image.jpg"] = "/data/image.jpg"
        cachedThumbnailMap["/One_Drive/audio.m4a"] = "/data/audio.m4a"
        cachedThumbnailMap["/Google_Drive/document.pdf"] = "/data/document.pdf"
        cachedThumbnailMap["/One_Drive/video.mp4"] = "/data/video.mp4"
        cachedThumbnailMap["/Google_Drive/installation.apk"] = "/data/installation.apk"
        cachedThumbnailMap["/One_Drive/files.docx"] = "/data/files.docx"
    }
}