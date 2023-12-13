package in_myfiles.structural_pattern.flyweight.page_spec

enum class PageType {
    HOME,
    RECENT,
    LOCAL_INTERNAL,
    LOGIN_GOOGLE_DRIVE,
    GOOGLE_DRIVE, // this case will be thrown IllegalArgumentException
    ONE_DRIVE
}