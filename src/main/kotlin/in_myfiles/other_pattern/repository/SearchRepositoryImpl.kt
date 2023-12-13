package in_myfiles.other_pattern.repository

class SearchRepositoryImpl(private val searchDataSource: SearchDataSource) : SearchRepository() {
    companion object {
        @Volatile
        private var instance: SearchRepository? = null

        fun getInstance(searchDataSource: SearchDataSource): SearchRepository =
            instance ?: synchronized(SearchRepositoryImpl(searchDataSource)) {
                instance ?: SearchRepositoryImpl(searchDataSource).also { instance = it }
            }
    }
//////////////////////////////////////////////////////////////////////////////////////////////
    override fun getFileInfoList(queryParams: QueryParams): List<SearchFileInfo> {
        return searchDataSource.getSearchFileInfoList(queryParams)
    }
}