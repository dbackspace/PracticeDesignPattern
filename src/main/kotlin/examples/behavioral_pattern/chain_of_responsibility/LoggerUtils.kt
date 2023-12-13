package examples.behavioral_pattern.chain_of_responsibility

object LoggerUtils {
    fun getLogger(): Logger {
        val consoleLogger = ConsoleLogger(LogLevel.WARN)
        consoleLogger.setNext(SystemLogger(LogLevel.ERROR))
        return consoleLogger
    }
}