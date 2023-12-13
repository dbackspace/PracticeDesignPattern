package in_myfiles.structural_pattern.bridge

object ResourceManager : ResourceBridge {

    fun init() {
        Resource.init(this)
    }

    override fun getResource(feature: Int): ResourceRequest {
        return when (feature) {
            Feature.HOME -> HomeResRequest()
            Feature.STORAGE -> StorageResRequest()
            Feature.CLOUD -> CloudResRequest()
            else -> DefaultResRequest()
        }
    }
}