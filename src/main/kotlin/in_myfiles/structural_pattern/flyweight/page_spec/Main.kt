package in_myfiles.structural_pattern.flyweight.page_spec

/**
 * FLYWEIGHT PATTERN - IN MYFILES (PAGE SPEC)
 */

fun main(args: Array<String>) {
    Application().dummyFunction()

    // case is fragment
    var pageType = PageType.LOCAL_INTERNAL
    var pageSpec = PageStore.getPageSpec(pageType)
    println("Container id of ${pageType.name}: ${pageSpec.fragmentContainerId}")

    // case is activity
    pageType = PageType.LOGIN_GOOGLE_DRIVE
    pageSpec = PageStore.getPageSpec(pageType)
    println("Container id of ${pageType.name}: ${pageSpec.fragmentContainerId}")

    // case has no exist
    pageType = PageType.GOOGLE_DRIVE
    pageSpec = PageStore.getPageSpec(pageType)
    println("Container id of ${pageType.name}: ${pageSpec.fragmentContainerId}")
}