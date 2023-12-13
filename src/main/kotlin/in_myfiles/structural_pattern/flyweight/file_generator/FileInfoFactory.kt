package in_myfiles.structural_pattern.flyweight.file_generator

typealias FileInfoGeneratorSupplier = () -> FileInfoGenerator<*>

class FileInfoFactory {
    companion object {
        private lateinit var defaultGenerator: FileInfoGenerator<*>
        private val fileGeneratorMap = hashMapOf<Int, FileInfoGenerator<*>>()

        fun registerDefaultSupplier(supplier: FileInfoGeneratorSupplier) {
            defaultGenerator = supplier()
        }

        fun registerFileInfoGenerator(supplier: FileInfoGeneratorSupplier) {
            val generator = supplier()
            val supportDomainType = generator.supportDomainType()
            supportDomainType.forEach { domainType ->
                fileGeneratorMap[domainType] = generator
            }
        }

        @Synchronized
        fun getGenerator(domainType: Int): FileInfoGenerator<*> {
            return fileGeneratorMap[domainType] ?: defaultGenerator
        }

        fun create(domainType: Int, isFile: Boolean, path: String): FileInfo {
            val generator = getGenerator(domainType)
            return generator.create(domainType, isFile, path) as FileInfo
        }
    }
}