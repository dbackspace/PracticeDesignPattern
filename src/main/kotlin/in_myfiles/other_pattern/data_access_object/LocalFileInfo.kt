package in_myfiles.other_pattern.data_access_object

data class LocalFileInfo(
    var fileId: Long,
    var name: String,
    var extension: String,
    var path: String,
    var size: Long,
    var dateModified: Long,
    var isHidden: Boolean
)
