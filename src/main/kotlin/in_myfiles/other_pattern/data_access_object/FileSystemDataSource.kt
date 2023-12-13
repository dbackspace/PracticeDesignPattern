package in_myfiles.other_pattern.data_access_object

class FileSystemDataSource {
    private val listFileSystem = mutableListOf<FileSystem>()

    init {
        if (listFileSystem.isEmpty()) {
            initListFileSystem() // fake data retrieved from system
        }
    }

    private fun initListFileSystem() {
        repeat(10) { index ->
            val fileName = if (index.mod(2L) == 0L) "file_$index.jpg" else ".hidden_file_$index.mp3"
            val file = FileSystem(
                fileId = index.toLong(),
                name = fileName,
                path = "storage/emulated/0/$fileName",
                size = index * 100L,
                dateModified = index * 123456L
            )
            listFileSystem.add(file)
        }
    }

    fun getAllFiles(): List<FileSystem> {
        return listFileSystem
    }

    fun countFiles(): Int {
        return listFileSystem.size
    }

    fun getFile(fileId: Long): FileSystem {
        return listFileSystem.stream().filter { file -> file.fileId == fileId }.findFirst().get()
    }

    fun deleteFile(fileId: Long) {
        getFile(fileId).let {
            listFileSystem.remove(it)
        }
    }

    fun updateFile(file: FileSystem) {
        listFileSystem.forEachIndexed { index, fileSystem ->
            if (fileSystem.fileId == file.fileId) {
                listFileSystem[index] = file
                return@forEachIndexed
            }
        }
    }

    fun insertFile(file: FileSystem) {
        listFileSystem.add(file)
    }
}