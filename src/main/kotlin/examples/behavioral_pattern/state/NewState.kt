package examples.behavioral_pattern.state

class NewState : State {
    override fun handleRequest() {
        println("Create a new document")
    }
}