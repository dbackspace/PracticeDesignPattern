package examples.behavioral_pattern.state

class ApprovedState : State {
    override fun handleRequest() {
        println("Approved")
    }
}