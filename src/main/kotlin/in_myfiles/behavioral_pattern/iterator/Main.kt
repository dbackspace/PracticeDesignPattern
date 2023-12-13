package in_myfiles.behavioral_pattern.iterator

/**
 * ITERATOR PATTERN - IN MYFILES
 */

class Directory(val files: List<FileInfo>)
class DirectoryIterator(private val files: List<FileInfo>): Iterable<FileInfo> by files
operator fun Directory.iterator(): Iterator<FileInfo> = files.iterator()

fun main(args: Array<String>) {
    val listFileInfo = FileInfoDataSource.getListFileInfo()

    println("Method 1:")
    for (fileInfo in Directory(listFileInfo)) {
        println(fileInfo)
    }
    println()

    println("Method 2:")
    val directoryIterator = DirectoryIterator(listFileInfo)
    directoryIterator.forEach { fileInfo ->
        println(fileInfo)
    }
    println()

    val checkedFileInfo = FileInfo("document", "xlsx", 1110, 1200)
    println("Exist checked file info: ${directoryIterator.contains(checkedFileInfo)}")
}