package in_myfiles.other_pattern.intercepting_filter

interface FileFilter {
    fun execute(fileRequest: FileRequest)
}