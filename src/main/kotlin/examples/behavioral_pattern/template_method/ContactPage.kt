package examples.behavioral_pattern.template_method

class ContactPage : PageTemplate() {
    override fun getPageInfo(): String {
        return "ContactPage"
    }

    override fun showBody() {
        println("${getPageInfo()}: contact us by number: 0987654321")
    }

    override fun showNavigation() {
        // do nothing
    }
}