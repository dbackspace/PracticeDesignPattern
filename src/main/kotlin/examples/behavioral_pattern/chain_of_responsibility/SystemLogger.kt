package examples.behavioral_pattern.chain_of_responsibility

class SystemLogger(logLevel: LogLevel) : BaseLogger(logLevel) {

    override fun writeMsg(msg: String) {
        println("System logger: $msg")
    }

    override fun canHandle(security: LogLevel): Boolean {
        return logLevel.level == security.level
    }
}