package in_myfiles.structural_pattern.flyweight.file_generator

class LocalFileInfo(override var domainType: Int, override var path: String) : FileInfo {

    override fun toString(): String {
        return "LocalFileInfo: domainType = $domainType, path = $path"
    }
}