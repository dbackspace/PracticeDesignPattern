package examples.behavioral_pattern.state

class RejectedState : State {
    override fun handleRequest() {
        println("Rejected")
    }
}