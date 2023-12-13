package in_myfiles.structural_pattern.proxy

class DownloadThumbnail : ThumbnailInterface {
    override fun getThumbnailPath(requestPath: String): String {
        return downloadThumbnailPath(requestPath)
    }

    private fun downloadThumbnailPath(requestPath: String): String {
        return "Download/${requestPath.substringAfterLast("/")}"
    }
}