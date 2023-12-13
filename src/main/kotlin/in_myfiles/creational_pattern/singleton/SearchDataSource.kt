package in_myfiles.creational_pattern.singleton

class SearchDataSource {
    companion object {
        @Volatile
        private var instance: SearchDataSource? = null

        fun getInstance(): SearchDataSource =
            instance ?: synchronized(SearchDataSource) {
                instance ?: SearchDataSource().also { instance = it }
            }
    }

    fun query(searchType: SearchType) {
        when (searchType) {
            SearchType.LOCAL -> println("Search query in local!")
            SearchType.CLOUD -> println("Search query in cloud!")
        }
    }
}