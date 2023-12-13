package in_myfiles.creational_pattern.builder

class DialogBuilder {
    private var title: String = ""
    private var message: String = ""
    private var positiveButton: String = ""
    private var neutralButton: String = ""
    private var negativeButton: String = ""

    fun setTitle(title: String) = apply {
        this.title = title
    }

    fun setMessage(message: String) = apply {
        this.message = message
    }

    fun setPositiveButton(positiveButton: String) = apply {
        this.positiveButton = positiveButton
    }

    fun setNeutralButton(neutralButton: String) = apply {
        this.neutralButton = neutralButton
    }

    fun setNegativeButton(negativeButton: String) = apply {
        this.negativeButton = negativeButton
    }

    fun build(): DialogBuilder {
        title.exist { println("Set title") }
        message.exist { println("Set message") }
        positiveButton.exist { println("Set positive button") }
        neutralButton.exist { println("Set neutral button") }
        negativeButton.exist { println("Set negative button") }
        return this
    }

    private fun String.exist(notify: () -> Unit) {
        if (isNotEmpty()) notify()
    }
}