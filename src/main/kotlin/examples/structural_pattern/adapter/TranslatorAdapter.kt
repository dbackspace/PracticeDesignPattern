package examples.structural_pattern.adapter

class TranslatorAdapter(private val japaneseTranslator: JapaneseTranslator) : ISourceEnglish {
    override fun send(originalText: String) {
        println("Reading text...")
        println("Original text is: $originalText")
        println("Prepare translate...")
        japaneseTranslator.receive(translate(originalText))
    }

    private fun translate(text: String): String {
        return "ハローワールド!"
    }
}