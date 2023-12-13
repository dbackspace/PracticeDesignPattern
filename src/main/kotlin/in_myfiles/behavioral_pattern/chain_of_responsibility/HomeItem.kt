package in_myfiles.behavioral_pattern.chain_of_responsibility

abstract class HomeItem : HomeItemInterface {
    var next: HomeItemInterface? = null

    override fun setNext(homeItem: HomeItem) {
        next = homeItem
    }

    override fun initLayout() {
        if (isVisible()) {
            bindLayout()
        }
        next?.initLayout()
    }

    abstract fun bindLayout()
}