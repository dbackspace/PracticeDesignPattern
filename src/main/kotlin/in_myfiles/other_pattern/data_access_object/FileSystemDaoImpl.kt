package in_myfiles.other_pattern.data_access_object

class FileSystemDaoImpl :
    FileSystemDao<FileSystem> {
    private val fileSystemDataSource =
        FileSystemDataSource()

    override fun loadAllFiles(): List<FileSystem> {
        return fileSystemDataSource.getAllFiles()
    }

    override fun countFiles(): Int {
        return fileSystemDataSource.countFiles()
    }

    override fun getFile(fileId: Long): FileSystem {
        return fileSystemDataSource.getFile(fileId)
    }

    override fun delete(fileId: Long) {
        fileSystemDataSource.deleteFile(fileId)
    }

    override fun update(file: FileSystem) {
        fileSystemDataSource.updateFile(file)
    }

    override fun insert(file: FileSystem) {
        fileSystemDataSource.insertFile(file)
    }
}