package in_myfiles.structural_pattern.composite

data class DirectoryFileInfo(
    private val name: String,
    val files: List<FileInfo>
) : FileInfo {
    override fun getName(): String {
        return name
    }

    override fun getSize(): Long {
        return files.sumOf { fileInfo -> fileInfo.getSize() }
    }

    override fun isFile(): Boolean {
        return false
    }

    override fun showDetails() {
        files.forEach { fileInfo -> fileInfo.showDetails() }
    }
}