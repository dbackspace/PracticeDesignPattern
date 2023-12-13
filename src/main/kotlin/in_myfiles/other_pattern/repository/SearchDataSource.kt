package in_myfiles.other_pattern.repository

interface SearchDataSource {
    fun getSearchFileInfoList(queryParams: QueryParams): List<SearchFileInfo>
}