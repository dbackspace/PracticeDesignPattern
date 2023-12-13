package in_myfiles.other_pattern.intercepting_filter

object FileInfoFactory {
    fun createListFileInfo(): ArrayList<FileInfo> {
        val listFileInfo = ArrayList<FileInfo>()
        repeat(20) { index ->
            val fileName = if (index.mod(2L) == 0L) "file_$index.jpg" else ".hidden_file_$index.mp3"
            val filePath = if (index.mod(3L) == 0L) "storage/emulated/0/$fileName" else "mnt/media_rw/$fileName"
            val file = FileInfo(
                fileId = index.toLong(),
                name = fileName,
                path = filePath,
                size = index * 100L,
                dateModified = index * 123456L,
                isHidden = fileName.first() == '.'
            )
            listFileInfo.add(file)
        }
        return listFileInfo
    }
}