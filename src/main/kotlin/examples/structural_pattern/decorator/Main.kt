package examples.structural_pattern.decorator

/**
 * DECORATOR PATTERN - OTHER WAY
 * https://github.com/lmller/gof-in-kotlin/blob/master/src/main/java/lmller/github/io/gofkotlin/decorator/Decorator.kt
 */

infix fun ((String) -> String).then(f: (String) -> String): (String) -> String {
    return { t -> f(this(t)) }
}

operator fun ((String) -> String).plus(f: (String) -> String) = then(f)

infix fun String.decorate(f: (String) -> String): Text {
    return DefaultText(f(this))
}

fun Text.underline(decorated: Text.() -> Unit) {
    print("_")
    this.decorated()
    print("_")
}

fun Text.background(decorated: Text.() -> Unit) {
    print("\u001B[43m")
    this.decorated()
    print("\u001B[0m")
}

fun preDecorated(decorated: Text.() -> Unit): Text.() -> Unit {
    return {
        background {
            underline {
                decorated()
            }
        }
    }
}

fun main(args: Array<String>) {
//    DefaultText("Supplier?").run {
//        preDecorated {
//            draw()
//        }
//    }

    fun underline(text: String) = "_${text}_"
    fun background(text: String) = "\u001B[43m$text\u001B[0m"
    val text = "Functional?" decorate (::underline then ::background + ::underline)
    text.draw()
}