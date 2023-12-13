package in_myfiles.other_pattern.intercepting_filter

class FilterManager(source: Source, target: Target) {
    private var filterChain: FilterChain = FilterChain()

    init {
        filterChain.setSource(source)
        filterChain.setTarget(target)
    }

    fun addFileFilter(filter: FileFilter) {
        filterChain.addFilter(filter)
    }

    fun execute(fileRequest: FileRequest) {
        filterChain.execute(fileRequest)
    }
}