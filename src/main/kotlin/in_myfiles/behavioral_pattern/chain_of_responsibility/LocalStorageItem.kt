package in_myfiles.behavioral_pattern.chain_of_responsibility

class LocalStorageItem : HomeItem() {
    override fun bindLayout() {
        println("Local storage layout: created")
    }

    override fun isVisible(): Boolean {
        return Features.isSupportLocalStorage()
    }
}