package in_myfiles.other_pattern.data_access_object

interface FileSystemDao<T : FileSystem> {
    fun loadAllFiles(): List<T>

    fun countFiles(): Int

    fun getFile(fileId: Long): T

    fun insert(file: T)

    fun update(file: T)

    fun delete(fileId: Long)
}