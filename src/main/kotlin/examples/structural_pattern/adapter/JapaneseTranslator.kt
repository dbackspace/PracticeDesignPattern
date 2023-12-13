package examples.structural_pattern.adapter

class JapaneseTranslator {
    fun receive(translatedText: String) {
        println("Translated to Japanese: $translatedText")
    }
}