package in_myfiles.other_pattern.data_access_object

class LocalFileRepository {
    private val fileSystemDaoImpl = FileSystemDaoImpl()

    fun loadAllFileInfo(): List<LocalFileInfo> {
        return fileSystemDaoImpl.loadAllFiles().map { convertFileSystemToLocalFileInfo(it) }
    }

    fun getTotalFileCount(): Int {
        return fileSystemDaoImpl.countFiles()
    }

    fun getLocalFileInfo(fileId: Long): LocalFileInfo {
        val fileSystem = fileSystemDaoImpl.getFile(fileId)
        return convertFileSystemToLocalFileInfo(fileSystem)
    }

    fun insertFile(fileInfo: LocalFileInfo) {
        val fileSystem = convertLocalFileInfoToFileSystem(fileInfo)
        fileSystemDaoImpl.insert(fileSystem)
    }

    fun updateFile(fileInfo: LocalFileInfo) {
        val fileSystem = convertLocalFileInfoToFileSystem(fileInfo)
        fileSystemDaoImpl.update(fileSystem)
    }

    fun deleteFile(fileId: Long) {
        fileSystemDaoImpl.delete(fileId)
    }

    private fun convertFileSystemToLocalFileInfo(fileSystem: FileSystem): LocalFileInfo {
        return LocalFileInfo(
            fileId = fileSystem.fileId,
            name = fileSystem.name,
            extension = fileSystem.name.substringAfterLast("."),
            path = fileSystem.path,
            size = fileSystem.size,
            dateModified = fileSystem.dateModified,
            isHidden = fileSystem.name.first() == '.'
        )
    }

    private fun convertLocalFileInfoToFileSystem(fileInfo: LocalFileInfo): FileSystem {
        return FileSystem(
            fileId = fileInfo.fileId,
            name = fileInfo.name,
            path = fileInfo.path,
            size = fileInfo.size,
            dateModified = fileInfo.dateModified
        )
    }
}