package examples.creational_pattern.singleton

import in_myfiles.creational_pattern.singleton.SearchDataSource

class LazySingletonClass private constructor() {
    companion object {
        @Volatile
        private var instance: LazySingletonClass? = null

        fun getInstance(): LazySingletonClass =
            instance ?: synchronized(LazySingletonClass) {
                instance ?: LazySingletonClass().also { instance = it }
            }
    }
}