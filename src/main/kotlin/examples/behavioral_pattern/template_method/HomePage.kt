package examples.behavioral_pattern.template_method

class HomePage : PageTemplate() {
    override fun getPageInfo(): String {
        return "HomePage"
    }

    override fun showBody() {
        println("${getPageInfo()}: show home page with menus")
    }
}