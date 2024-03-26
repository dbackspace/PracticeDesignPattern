package examples.creational_pattern.singleton

fun main() {
//    reflectionEagerSingleton()
//    reflectLazySingleton()
}

private fun reflectEagerSingleton() {
    val instance1 = EagerSingletonClass.getInstance()
    var instance2: EagerSingletonClass? = null
    try {
        val constructors = EagerSingletonClass::class.java.declaredConstructors
        for (constructor in constructors) {
            constructor.isAccessible = true
            instance2 = constructor.newInstance() as EagerSingletonClass
            break;
        }
    } catch (e : Exception) {
        e.printStackTrace()
    }
    println("Hash code of instance1 = ${instance1.hashCode()}")
    println("Hash code of instance2 = ${instance2.hashCode()}")
}

private fun reflectLazySingleton() {
    val instance1 = LazySingletonClass.getInstance()
    var instance2: LazySingletonClass? = null
    try {
        val constructors = LazySingletonClass::class.java.declaredConstructors
        for (constructor in constructors) {
            constructor.isAccessible = true
            instance2 = constructor.newInstance() as LazySingletonClass
            break;
        }
    } catch (e : Exception) {
        e.printStackTrace()
    }
    println("Hash code of instance1 = ${instance1.hashCode()}")
    println("Hash code of instance2 = ${instance2.hashCode()}")
}