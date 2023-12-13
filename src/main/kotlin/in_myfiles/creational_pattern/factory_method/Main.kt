package in_myfiles.creational_pattern.factory_method

/**
 * FACTORY METHOD PATTERN - IN MYFILES
 */

fun main(args: Array<String>) {
    val listFileInfo = FileInfoDataSource.getListFileInfo()
    val sortType = SortType.NAME
    val isAscending = true
    val comparator = ComparatorFactory.getSortByComparator(sortType, isAscending)
    listFileInfo.sortedWith(comparator).forEach { println(it) }
}