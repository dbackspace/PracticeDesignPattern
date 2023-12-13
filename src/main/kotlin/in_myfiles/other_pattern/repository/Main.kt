package in_myfiles.other_pattern.repository

/**
 * REPOSITORY PATTERN - IN MYFILES
 */

fun main(args: Array<String>) {
    val searchDataSource = SearchDataSourceImpl()
    val searchRepository = SearchRepositoryImpl.getInstance(searchDataSource)
    val searchController = SearchController(searchRepository)
    val queryParams = QueryParams().apply {
        searchType = SearchType.CLOUD
    }
    searchController.getFileInfoList(queryParams).forEach { searchFileInfo ->
        println(searchFileInfo)
    }
}