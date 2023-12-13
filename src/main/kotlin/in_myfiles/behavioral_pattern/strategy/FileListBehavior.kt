package in_myfiles.behavioral_pattern.strategy

interface FileListBehavior {
    fun setCurrentPageInfo(currentPageInfo: PageInfo)
    fun initListener()
    fun setCurrentViewAs(currentViewAs: Int)
    fun notifyListAdapter()
}