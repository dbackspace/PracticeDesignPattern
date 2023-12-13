package in_myfiles.structural_pattern.flyweight.file_generator

class DefaultFileInfoGenerator : FileInfoGenerator<FileInfo> {
    override fun supportDomainType(): IntArray {
        return intArrayOf(DomainType.UNKNOWN)
    }

    override fun create(domainType: Int, isFile: Boolean, path: String): FileInfo? {
        return null
    }
}