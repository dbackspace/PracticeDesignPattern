package in_myfiles.structural_pattern.decorator

/**
 * DECORATOR PATTERN - IN MYFILES
 */

fun main(args: Array<String>) {
    val operation = DownloadOperation().apply {
        decorator = MultipleStorageDecoration().apply {
            decorator = CopyOperation()
        }
    }
    println(operation.doOperation())
}