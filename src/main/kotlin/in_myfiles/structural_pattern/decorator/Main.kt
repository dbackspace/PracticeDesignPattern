package in_myfiles.structural_pattern.decorator

/**
 * DECORATOR PATTERN - IN MYFILES
 */

fun main(args: Array<String>) {
    val operation = DownloadOperation(MultipleStorageDecoration(CopyOperation()))
    println(operation.doOperation())
}