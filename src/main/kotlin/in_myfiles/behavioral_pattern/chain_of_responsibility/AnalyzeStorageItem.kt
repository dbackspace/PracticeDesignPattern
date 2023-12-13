package in_myfiles.behavioral_pattern.chain_of_responsibility

class AnalyzeStorageItem : HomeItem() {
    override fun bindLayout() {
        println("Analyze storage layout: created")
    }

    override fun isVisible(): Boolean {
        return Features.isSupportAnalyzeStorage()
    }
}