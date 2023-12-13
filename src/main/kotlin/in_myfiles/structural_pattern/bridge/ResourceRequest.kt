package in_myfiles.structural_pattern.bridge

interface ResourceRequest {
    fun string(id: Int): String
    fun dimen(id: Int): String
    fun drawable(id: Int): String
    fun color(id: Int): String
}