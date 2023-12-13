package examples.structural_pattern.adapter

/**
 * ADAPTER PATTERN
 */

fun main(args: Array<String>) {
    val translatorAdapter = TranslatorAdapter(JapaneseTranslator())
    val originalText = "Hello world!"
    translatorAdapter.send(originalText)
}