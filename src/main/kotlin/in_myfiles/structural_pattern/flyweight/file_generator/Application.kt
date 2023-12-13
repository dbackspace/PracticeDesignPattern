package in_myfiles.structural_pattern.flyweight.file_generator

class Application {
    init {
        FileInfoFactory.registerDefaultSupplier { DefaultFileInfoGenerator() }
        FileInfoFactory.registerFileInfoGenerator { LocalFileInfoGenerator() }
        FileInfoFactory.registerFileInfoGenerator { CategoryFileInfoGenerator() }
    }

    fun dummyFunction() {
        // only dummy to Application class
    }
}