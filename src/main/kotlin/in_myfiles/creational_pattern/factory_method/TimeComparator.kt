package in_myfiles.creational_pattern.factory_method

class TimeComparator(private val isAscending: Boolean) : Comparator<FileInfo> {
    override fun compare(f1: FileInfo, f2: FileInfo): Int {
        val ret = f1.time.compareTo(f2.time)
        return if (isAscending) ret else -ret
    }
}