package in_myfiles.structural_pattern.bridge

class StorageResRequest : ResRequest() {
    init {
        strIdMap[ResourceResId.StringRes.INTERNAL_STORAGE] = "Storage res: Internal Storage"
        strIdMap[ResourceResId.StringRes.SD_CARD] = "Storage res: SD Card"
    }
}