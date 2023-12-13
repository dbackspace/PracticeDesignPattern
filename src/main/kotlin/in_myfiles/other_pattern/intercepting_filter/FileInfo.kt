package in_myfiles.other_pattern.intercepting_filter

data class FileInfo(
    var fileId: Long,
    var name: String,
    var path: String,
    var size: Long,
    var dateModified: Long,
    var isHidden: Boolean
)