package in_myfiles.other_pattern.repository

import java.util.*

class SearchDataSourceImpl : SearchDataSource {
    private var searchMap = EnumMap<SearchType, SearchInterface>(SearchType::class.java)

    init {
        searchMap[SearchType.LOCAL] = SearchLocalDataSource()
        searchMap[SearchType.CLOUD] = SearchCloudDataSource()
    }

    override fun getSearchFileInfoList(queryParams: QueryParams): List<SearchFileInfo> {
        val searchType = queryParams.searchType
        val searchInterface = searchMap[searchType]
        return searchInterface?.query() ?: emptyList()
    }
}