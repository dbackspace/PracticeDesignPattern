package examples.behavioral_pattern.chain_of_responsibility

interface Logger {
    fun setNext(next: Logger): Logger
    fun log(security: LogLevel, msg: String)
}