package in_myfiles.structural_pattern.flyweight.file_generator

data class CategoryFileInfo(override var domainType: Int, override var path: String) : FileInfo {
    override fun toString(): String {
        return "CategoryFileInfo: domainType = $domainType, path = $path"
    }
}
