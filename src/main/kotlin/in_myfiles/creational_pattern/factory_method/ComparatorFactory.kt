package in_myfiles.creational_pattern.factory_method

object ComparatorFactory {
    fun getSortByComparator(sortType: SortType, isAscending: Boolean): Comparator<FileInfo> {
        return when (sortType) {
            SortType.NAME -> NameComparator(isAscending)
            SortType.EXT -> ExtensionComparator(isAscending)
            SortType.TIME -> TimeComparator(isAscending)
            else -> SizeComparator(isAscending)
        }
    }
}