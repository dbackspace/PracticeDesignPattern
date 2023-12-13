package in_myfiles.structural_pattern.proxy

/**
 * PROXY PATTERN - IN MYFILES
 */

fun main(args: Array<String>) {
    val proxyThumbnail = CachedThumbnail()

    // case has no cached, must have download from server
    var requestPath = "/Google_Drive/xxx.jpeg"
    var thumbnailPath = proxyThumbnail.getThumbnailPath(requestPath)
    println("Get thumbnail by download from server: $thumbnailPath")

    // case existed in cached
    requestPath = "/Google_Drive/document.pdf"
    thumbnailPath = proxyThumbnail.getThumbnailPath(requestPath)
    println("Get thumbnail from cached: $thumbnailPath")
}