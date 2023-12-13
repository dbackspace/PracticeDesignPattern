package in_myfiles.structural_pattern.proxy

class CachedThumbnail : ThumbnailInterface {
    private var downloadThumbnail: DownloadThumbnail? = null

    override fun getThumbnailPath(requestPath: String): String? {
        return hasCached(requestPath) ?: run {
            // should be provided lock download class to avoid other class access at the same time
            if (downloadThumbnail == null) {
                downloadThumbnail = DownloadThumbnail()
            }
            return downloadThumbnail?.getThumbnailPath(requestPath)
        }
    }

    private fun hasCached(requestPath: String): String? {
        return CachedThumbnailDataSource.cachedThumbnailMap.computeIfPresent(requestPath) { _, value ->
            return@computeIfPresent value
        }
    }
}