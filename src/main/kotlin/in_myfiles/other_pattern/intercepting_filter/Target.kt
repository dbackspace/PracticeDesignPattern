package in_myfiles.other_pattern.intercepting_filter

class Target {
    fun execute(fileRequest: FileRequest) {
        println("After applied filters] Total count files = ${fileRequest.listFileInfo.size}")
    }
}