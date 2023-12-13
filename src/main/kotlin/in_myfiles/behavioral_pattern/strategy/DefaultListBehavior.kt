package in_myfiles.behavioral_pattern.strategy

open class DefaultListBehavior : FileListBehavior {
    protected open var pageInfo = PageInfo()
    protected open var viewAs = 0
    override fun setCurrentPageInfo(currentPageInfo: PageInfo) {
        pageInfo = currentPageInfo
    }

    override fun initListener() {
        println("Init listener: completed")
    }

    override fun setCurrentViewAs(currentViewAs: Int) {
        viewAs = currentViewAs
    }

    override fun notifyListAdapter() {
        println("Notify list adapter: completed")
    }

    protected open fun updateItems(items: List<String>) {
        println("Default list behavior - update items: completed")
    }
}