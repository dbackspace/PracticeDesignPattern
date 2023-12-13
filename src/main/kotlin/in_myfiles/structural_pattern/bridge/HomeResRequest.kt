package in_myfiles.structural_pattern.bridge

class HomeResRequest : ResRequest() {
    init {
        strIdMap[ResourceResId.StringRes.HOME_RECENT] = "Home res: Recent"
        strIdMap[ResourceResId.StringRes.HOME_CATEGORY] = "Home res: Category"
    }
}