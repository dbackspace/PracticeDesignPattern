package in_myfiles.behavioral_pattern.iterator

data class FileInfo(
    val name: String,
    val ext: String,
    val time: Long,
    val size: Long
) {
    override fun hashCode(): Int {
        return name.hashCode()
    }
}
