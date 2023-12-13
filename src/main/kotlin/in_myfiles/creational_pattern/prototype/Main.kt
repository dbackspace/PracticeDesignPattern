package in_myfiles.creational_pattern.prototype

/**
 * PROTOTYPE PATTERN - IN MYFILES
 * https://chercher.tech/kotlin/prototype-design-pattern-kotlin
 */

fun FileInfo.makeGroupHeader(): FileInfo {
    createGroupHeader()
    return this
}

fun main(args: Array<String>) {
    val localFileInfo = FileInfo()
    val groupHeaderInfo = localFileInfo.clone().makeGroupHeader()
    println("Before make group header: $localFileInfo")
    println("After make group header: $groupHeaderInfo")
}