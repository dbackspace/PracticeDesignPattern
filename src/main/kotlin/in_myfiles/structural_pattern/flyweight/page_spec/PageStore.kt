package in_myfiles.structural_pattern.flyweight.page_spec

import java.util.*

object PageStore {
    private var pageSpecMap = EnumMap<PageType, PageSpec>(PageType::class.java)

    fun addFragmentPage(pageType: PageType, clazz: Class<*>, containerId: Int) {
        pageSpecMap[pageType] = PageSpec.createFragmentSpec(clazz, containerId)
    }

    fun addActivityPage(pageType: PageType, clazz: Class<*>) {
        pageSpecMap[pageType] = PageSpec.createActivitySpec(clazz)
    }

    fun getPageSpec(pageType: PageType): PageSpec {
        return pageSpecMap[pageType] ?: throw IllegalArgumentException("Unregistered page type - ${pageType.name}")
    }
}