package examples.creational_pattern.singleton

class EagerSingletonClass private constructor() {
    companion object {
        private val INSTANCE = EagerSingletonClass()

        fun getInstance() = INSTANCE
    }
}