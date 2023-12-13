package in_myfiles.structural_pattern.bridge

/**
 * BRIDGE PATTERN - IN MYFILES
 */

fun main(args: Array<String>) {
    ResourceManager.init() // init bridge first
    println(
        Resource.HomeRes()
            .string(ResourceResId.StringRes.HOME_RECENT))
    println(
        Resource.StorageRes()
            .string(ResourceResId.StringRes.INTERNAL_STORAGE))
    println(
        Resource.CloudRes()
            .string(ResourceResId.StringRes.GOOGLE_DRIVE_CLOUD))
    println(
        Resource.DefaultRes()
            .string(ResourceResId.StringRes.FAVORITE))
}