package in_myfiles.structural_pattern.flyweight.file_generator

class LocalFileInfoGenerator: FileInfoGenerator<LocalFileInfo> {
    override fun supportDomainType(): IntArray {
        return intArrayOf(DomainType.INTERNAL_STORAGE)
    }

    override fun create(domainType: Int, isFile: Boolean, path: String): LocalFileInfo {
        return LocalFileInfo(domainType, path)
    }
}