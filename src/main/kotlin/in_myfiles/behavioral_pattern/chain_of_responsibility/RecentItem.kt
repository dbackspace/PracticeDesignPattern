package in_myfiles.behavioral_pattern.chain_of_responsibility

class RecentItem : HomeItem() {
    override fun bindLayout() {
        println("Recent layout: created")
    }

    override fun isVisible(): Boolean {
        return Features.isSupportRecent()
    }
}