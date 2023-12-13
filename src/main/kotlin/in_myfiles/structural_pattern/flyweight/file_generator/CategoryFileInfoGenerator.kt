package in_myfiles.structural_pattern.flyweight.file_generator

class CategoryFileInfoGenerator : FileInfoGenerator<CategoryFileInfo> {
    override fun supportDomainType(): IntArray {
        return intArrayOf(DomainType.CATEGORY)
    }

    override fun create(domainType: Int, isFile: Boolean, path: String): CategoryFileInfo {
        return CategoryFileInfo(domainType, path)
    }
}