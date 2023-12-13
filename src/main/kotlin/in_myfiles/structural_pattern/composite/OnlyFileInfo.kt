package in_myfiles.structural_pattern.composite

data class OnlyFileInfo(
    private val name: String,
    private val size: Long
) : FileInfo {
    override fun getName(): String {
        return name
    }

    override fun getSize(): Long {
        return size
    }

    override fun isFile(): Boolean {
        return true
    }

    override fun showDetails() {
        println("OnlyFileInfo: name = ${getName()}, size = ${getSize()}")
    }
}