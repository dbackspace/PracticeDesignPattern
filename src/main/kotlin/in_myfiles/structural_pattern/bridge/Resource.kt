package in_myfiles.structural_pattern.bridge
import in_myfiles.structural_pattern.bridge.Feature.CLOUD
import in_myfiles.structural_pattern.bridge.Feature.DEFAULT
import in_myfiles.structural_pattern.bridge.Feature.HOME
import in_myfiles.structural_pattern.bridge.Feature.STORAGE

object Resource {
    private lateinit var bridge: ResourceBridge

    fun init(resourceBridge: ResourceBridge) {
        bridge = resourceBridge
    }

    fun get(feature: Int): ResourceRequest {
        return bridge.getResource(feature)
    }

    fun HomeRes(): ResourceRequest {
        return bridge.getResource(HOME)
    }

    fun DefaultRes(): ResourceRequest {
        return bridge.getResource(DEFAULT)
    }

    fun StorageRes(): ResourceRequest {
        return bridge.getResource(STORAGE)
    }

    fun CloudRes(): ResourceRequest {
        return bridge.getResource(CLOUD)
    }
}