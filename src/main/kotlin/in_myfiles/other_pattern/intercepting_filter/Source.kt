package in_myfiles.other_pattern.intercepting_filter

class Source {
    fun execute(fileRequest: FileRequest) {
        println("Before applied filters] Total count files = ${fileRequest.listFileInfo.size}")
    }
}