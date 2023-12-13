package in_myfiles.other_pattern.data_access_object

data class FileSystem(
    var fileId: Long,
    var name: String,
    var path: String,
    var size: Long,
    var dateModified: Long
)
