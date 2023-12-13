package in_myfiles.structural_pattern.bridge

class CloudResRequest : ResRequest() {
    init {
        strIdMap[ResourceResId.StringRes.GOOGLE_DRIVE_CLOUD] = "Cloud res: Google Drive Cloud"
        strIdMap[ResourceResId.StringRes.ONE_DRIVE_CLOUD] = "Cloud res: One Drive Cloud"
    }
}