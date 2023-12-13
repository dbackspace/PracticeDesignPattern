package in_myfiles.creational_pattern.prototype

open class FileInfo : Cloneable {
    private var name: String? = null
    private var size: Long = 0L
    private var isGroupHeader: Boolean

    init {
        name = "Local file info"
        size = 3000L
        isGroupHeader = false
    }

    public override fun clone(): FileInfo {
        return FileInfo()
    }

    fun createGroupHeader() {
        name = "Group Header"
        size = -1L
        isGroupHeader = true
    }

    override fun toString(): String {
        return "name = $name, size = $size, isGroupHeader = $isGroupHeader"
    }
}