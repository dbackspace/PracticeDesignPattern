package in_myfiles.other_pattern.null_object

/**
 * NULL OBJECT PATTERN - IN MYFILES
 * https://gpcoder.com/4920-huong-dan-java-design-pattern-null-object/
 */

fun main() {
    val domainType = FileOperationFactory.DomainType.UNKNOWN
    val fileOperation = FileOperationFactory.getFileOperation(domainType)

    // Prepare operation
    fileOperation.prepareOperation()

    // Create RW Param
    val rwParam = fileOperation.createParams()
    println(rwParam)
}