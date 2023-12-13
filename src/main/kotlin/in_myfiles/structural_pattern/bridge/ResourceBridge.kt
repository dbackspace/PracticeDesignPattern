package in_myfiles.structural_pattern.bridge

interface ResourceBridge {
    fun getResource(feature: Int): ResourceRequest
}