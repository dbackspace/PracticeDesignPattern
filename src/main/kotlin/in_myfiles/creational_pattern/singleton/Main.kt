package in_myfiles.creational_pattern.singleton

/**
 * SINGLETON PATTERN - IN MYFILES
 */

fun main(args: Array<String>) {
    var searchType = SearchType.LOCAL
    SearchDataSource.getInstance().query(searchType)

    // change search type -> searchDataSource does not need to re-initialize a new object
    searchType = SearchType.CLOUD
    SearchDataSource.getInstance().query(searchType)
}