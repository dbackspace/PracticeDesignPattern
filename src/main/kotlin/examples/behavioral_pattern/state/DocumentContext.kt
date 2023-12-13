package examples.behavioral_pattern.state

class DocumentContext {
    private var state: State? = null
    fun setCurrentState(currentState: State) {
        state = currentState
        applyState()
    }

    private fun applyState() {
        state?.handleRequest()
    }
}