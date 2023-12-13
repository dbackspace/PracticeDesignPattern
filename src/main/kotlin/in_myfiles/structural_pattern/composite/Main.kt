package in_myfiles.structural_pattern.composite

/**
 * COMPOSITE PATTERN - IN MYFILES
 * Other draw example: https://refactoring.guru/design-patterns/composite
 */

fun main(args: Array<String>) {
    val onlyFileInfo = FileInfoDataSource.getOnlyFileInfo()
    val directoryFileInfo = FileInfoDataSource.getDirectoryFileInfo()
    onlyFileInfo.showDetails()
    println("---------------------------")
    directoryFileInfo.showDetails()
    println("---------------------------")
    println("Total size of directory: ${directoryFileInfo.getSize()}")
}