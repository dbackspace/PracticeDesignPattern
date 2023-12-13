package examples.behavioral_pattern.template_method

class DetailPage : PageTemplate() {
    override fun getPageInfo(): String {
        return "DetailPage"
    }

    override fun showBody() {
        println("${getPageInfo()}: show detail for each page")
    }
}