package in_myfiles.other_pattern.repository

interface IFileInfoRepository<T: FileInfo> {
    fun getFileInfoList(queryParams: QueryParams): List<T>
    fun getFileInfoByPath(path: String): T
    fun getFileInfoByFileId(fileId: String): T
    fun deleteByFileId(fileId: String): Boolean
}