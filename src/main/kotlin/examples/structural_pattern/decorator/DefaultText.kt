package examples.structural_pattern.decorator

class DefaultText(private val text: String) : Text {
    override fun draw() {
        print(text)
    }
}