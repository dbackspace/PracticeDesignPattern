package in_myfiles.structural_pattern.flyweight.page_spec

class Application {
    init {
        PageStore.addFragmentPage(PageType.HOME, HomePage::class.java, 100)
        PageStore.addFragmentPage(PageType.RECENT, RecentFileListPage::class.java, 200)
        PageStore.addFragmentPage(PageType.LOCAL_INTERNAL, LocalFileListPage::class.java, 300)
        PageStore.addActivityPage(PageType.LOGIN_GOOGLE_DRIVE, GoogleDriveLoginActivity::class.java)
        PageStore.addFragmentPage(PageType.ONE_DRIVE, CloudFileListPage::class.java, 500)
    }

    fun dummyFunction() {
        // only dummy to Application class
    }
}