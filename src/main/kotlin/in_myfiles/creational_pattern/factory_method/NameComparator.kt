package in_myfiles.creational_pattern.factory_method

class NameComparator(private val isAscending: Boolean) : Comparator<FileInfo> {
    override fun compare(f1: FileInfo, f2: FileInfo): Int {
        val ret = f1.name.lowercase().compareTo(f2.name.lowercase(), ignoreCase = true)
        return if (isAscending) ret else -ret
    }
}