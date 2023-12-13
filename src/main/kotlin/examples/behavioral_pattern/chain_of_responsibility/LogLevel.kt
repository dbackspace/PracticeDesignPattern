package examples.behavioral_pattern.chain_of_responsibility

enum class LogLevel(val level: Int) {
    WARN(0), DEBUG(1), ERROR(2), VERBOSE(3), FATAL(4)
}