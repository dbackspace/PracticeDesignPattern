package examples.behavioral_pattern.chain_of_responsibility

abstract class BaseLogger(val logLevel: LogLevel) : Logger {
    protected var nextLogger: Logger? = null

    override fun setNext(next: Logger): Logger {
        nextLogger = next
        return next
    }

    override fun log(security: LogLevel, msg: String) {
        // luôn phải có check security đi kèm, nếu không nó sẽ in duplicate
        if (canHandle(security)) {
            writeMsg(msg)
        }
        nextLogger?.let {
            it.log(security, msg)
        }
    }

    abstract fun writeMsg(msg: String)
    abstract fun canHandle(security: LogLevel): Boolean
}