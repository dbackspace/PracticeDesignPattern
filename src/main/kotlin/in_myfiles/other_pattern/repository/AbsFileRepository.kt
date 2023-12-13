package in_myfiles.other_pattern.repository

abstract class AbsFileRepository<T: FileInfo> : IFileInfoRepository<T> {
    abstract override fun getFileInfoList(queryParams: QueryParams): List<T>
    override fun getFileInfoByPath(path: String): T {
        TODO("Not yet implemented")
    }

    override fun getFileInfoByFileId(fileId: String): T {
        TODO("Not yet implemented")
    }

    override fun deleteByFileId(fileId: String): Boolean {
        TODO("Not yet implemented")
    }
}