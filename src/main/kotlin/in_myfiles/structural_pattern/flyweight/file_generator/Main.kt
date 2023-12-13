package in_myfiles.structural_pattern.flyweight.file_generator

/**
 * FLYWEIGHT PATTERN - IN MYFILES (FILE GENERATOR)
 */

fun main(args: Array<String>) {
    Application().dummyFunction()
    val localFileInfo = FileInfoFactory.create(
        DomainType.INTERNAL_STORAGE,
        true,
        "/storage/emulated/0/DCIM/Camera/picture.jpeg"
    )
    println(localFileInfo)
}