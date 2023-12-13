package in_myfiles.structural_pattern.composite

object FileInfoDataSource {
    fun getOnlyFileInfo(): FileInfo {
        return OnlyFileInfo("local_file", 1500L)
    }

    fun getDirectoryFileInfo(): FileInfo {
        val files = listOf(
            OnlyFileInfo("local_file", 1500L),
            OnlyFileInfo("sd_card_file", 2800L),
            OnlyFileInfo("cloud_file", 400L),
            OnlyFileInfo("trash_file", 3600L)
        )
        return DirectoryFileInfo("folder_name", files)
    }
}