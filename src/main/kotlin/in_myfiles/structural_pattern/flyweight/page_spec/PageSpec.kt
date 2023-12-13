package in_myfiles.structural_pattern.flyweight.page_spec

class PageSpec(
    val pageFormat: PageFormat,
    val instanceClas: Class<*>,
    val fragmentContainerId: Int = DataConstant.UNDEFINED
) {
    companion object {
        fun createFragmentSpec(clazz: Class<*>, containerId: Int): PageSpec {
            return PageSpec(PageFormat.FRAGMENT, clazz, containerId)
        }

        fun createActivitySpec(clazz: Class<*>): PageSpec {
            return PageSpec(PageFormat.ACTIVITY, clazz)
        }
    }
}