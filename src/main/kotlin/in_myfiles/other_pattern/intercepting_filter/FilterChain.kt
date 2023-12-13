package in_myfiles.other_pattern.intercepting_filter

class FilterChain {
    private val listFileFilters = mutableListOf<FileFilter>()
    private lateinit var source: Source
    private lateinit var target: Target

    fun setSource(source: Source) {
        this.source = source
    }

    fun setTarget(target: Target) {
        this.target = target
    }

    fun addFilter(fileFilter: FileFilter) {
        listFileFilters.add(fileFilter)
    }

    fun execute(fileRequest: FileRequest) {
        source.execute(fileRequest)
        for (filter in listFileFilters) {
            filter.execute(fileRequest)
        }
        target.execute(fileRequest)
    }
}