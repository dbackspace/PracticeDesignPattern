package in_myfiles.other_pattern.repository

class SearchController(private val searchRepository: IFileInfoRepository<SearchFileInfo>) {
    fun getFileInfoList(queryParams: QueryParams): List<SearchFileInfo> {
        return searchRepository.getFileInfoList(queryParams)
    }
}