package in_myfiles.structural_pattern.flyweight.file_generator

interface FileInfoGenerator<T: FileInfo> {
    fun supportDomainType(): IntArray
    fun create(domainType: Int, isFile: Boolean, path: String): T?
}