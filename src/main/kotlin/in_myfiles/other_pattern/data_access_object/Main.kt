package in_myfiles.other_pattern.data_access_object

/**
 * DAO (Data Access Object) & Transfer Object Pattern - IN MYFILES
 * DAO: https://gpcoder.com/4935-huong-dan-java-design-pattern-dao/
 * Transfer Object: https://gpcoder.com/5156-huong-dan-java-design-pattern-transfer-object/
 */

fun main() {
    val localFileRepository = LocalFileRepository()

    // Load all files, size = 10
//    val listFileInfo = localFileRepository.loadAllFileInfo()
    val totalFileCount = localFileRepository.getTotalFileCount()
    println("Total files count = $totalFileCount")
    println("-----------------------------------")

    // Insert new file, size = 11
    val newFileInfo = LocalFileInfo(11,
        "new_file.wav",
        "wav" ,
        "storage/emulated/0/new_file.wav",
        1000L,
        12345678L,
        false)
    localFileRepository.insertFile(newFileInfo)
    println("After insert new file, total files count = ${localFileRepository.getTotalFileCount()}")
    println("-----------------------------------")

    // Update existed file has id = 5 by changing name
    val updateFileId = 5L
    val existedFile = localFileRepository.getLocalFileInfo(updateFileId)
    println("Before update, old name = ${existedFile.name}")
    existedFile.name = "new_update_name.mp4"
    localFileRepository.updateFile(existedFile)
    println("After update, new name = ${existedFile.name}")
    println("-----------------------------------")

    // Delete existed file has id = 5, size = 10
    val deleteFileId = 5L
    println("Before delete, total files count = ${localFileRepository.getTotalFileCount()}")
    localFileRepository.deleteFile(deleteFileId)
    println("After update, total files count = ${localFileRepository.getTotalFileCount()}")
}