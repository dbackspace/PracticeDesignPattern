package in_myfiles.other_pattern.repository

abstract class SearchRepository : AbsFileRepository<SearchFileInfo>() {
    abstract override fun getFileInfoList(queryParams: QueryParams): List<SearchFileInfo>
}