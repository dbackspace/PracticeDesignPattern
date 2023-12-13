package examples.behavioral_pattern.state

class SubmittedState : State {
    override fun handleRequest() {
        println("Submitted")
    }
}