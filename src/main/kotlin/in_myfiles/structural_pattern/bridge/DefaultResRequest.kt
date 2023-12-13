package in_myfiles.structural_pattern.bridge

class DefaultResRequest : ResRequest() {
    init {
        strIdMap[ResourceResId.StringRes.FAVORITE] = "Default res: Favorite"
        strIdMap[ResourceResId.StringRes.TRASH] = "Default res: Trash"
        strIdMap[ResourceResId.StringRes.ANALYZE_STORAGE] = "Default res: Analyze Storage"
    }
}