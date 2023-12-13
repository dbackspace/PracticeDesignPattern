package examples.behavioral_pattern.template_method

abstract class PageTemplate {
    fun initLayout() {
        showHeader()
        showBody()
        showFooter()
        showNavigation()
    }
    abstract fun getPageInfo(): String
    abstract fun showBody()

    protected open fun showHeader() {
        println("${getPageInfo()}: show header")
    }

    protected open fun showFooter() {
        println("${getPageInfo()}: show footer")
    }

    protected open fun showNavigation() {
        println("${getPageInfo()}: show navigation")
    }
}