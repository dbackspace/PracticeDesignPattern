package examples.behavioral_pattern.state

/**
 * STATE PATTERN
 * https://gpcoder.com/4785-huong-dan-java-design-pattern-state/
 */

fun main(args: Array<String>) {
    val documentContext = DocumentContext()
    documentContext.setCurrentState(NewState())
    documentContext.setCurrentState(RejectedState())
    documentContext.setCurrentState(NewState())
    documentContext.setCurrentState(SubmittedState())
    documentContext.setCurrentState(ApprovedState())
}