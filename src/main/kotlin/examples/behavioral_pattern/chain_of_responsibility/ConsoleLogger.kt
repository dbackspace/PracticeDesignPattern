package examples.behavioral_pattern.chain_of_responsibility

class ConsoleLogger(logLevel: LogLevel) : BaseLogger(logLevel) {

    override fun writeMsg(msg: String) {
        println("Console logger: $msg")
    }

    override fun canHandle(security: LogLevel): Boolean {
        return logLevel.level == security.level
    }
}