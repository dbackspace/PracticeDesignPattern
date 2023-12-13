package in_myfiles.behavioral_pattern.chain_of_responsibility

object HomeUtils {
    fun getHomeItemChain(): HomeItemInterface {
        val recentItem = RecentItem()
        val categoryItem = CategoryItem()
        val localStorageItem = LocalStorageItem()
        val analyzeStorageItem = AnalyzeStorageItem()
        recentItem.setNext(categoryItem)
        categoryItem.setNext(localStorageItem)
        localStorageItem.setNext(analyzeStorageItem)
        return recentItem
    }
}