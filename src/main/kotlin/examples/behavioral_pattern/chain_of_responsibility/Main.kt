package examples.behavioral_pattern.chain_of_responsibility

/**
 * CHAIN OF RESPONSIBILITY PATTERN
 */

fun main(args: Array<String>) {
    val logger = LoggerUtils.getLogger()
    logger.log(LogLevel.WARN, "warn")
    logger.log(LogLevel.ERROR, "error")
}