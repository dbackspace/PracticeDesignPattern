package in_myfiles.structural_pattern.composite

interface FileInfo {
    fun getName(): String
    fun getSize(): Long
    fun isFile(): Boolean
    fun showDetails()
}