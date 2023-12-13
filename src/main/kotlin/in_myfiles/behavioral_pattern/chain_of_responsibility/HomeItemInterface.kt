package in_myfiles.behavioral_pattern.chain_of_responsibility

interface HomeItemInterface {
    fun setNext(homeItem: HomeItem)
    fun initLayout()
    fun isVisible(): Boolean {
        return true
    }
}