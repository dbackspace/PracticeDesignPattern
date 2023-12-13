package in_myfiles.structural_pattern.bridge

abstract class ResRequest : ResourceRequest {
    protected val strIdMap = hashMapOf<Int, String>()
    protected val drawableMap = hashMapOf<Int, String>()
    protected val colorMap = hashMapOf<Int, String>()
    protected val dimenMap = hashMapOf<Int, String>()

    override fun string(id: Int): String {
        return strIdMap[id] ?: ""
    }

    override fun drawable(id: Int): String {
        return drawableMap[id] ?: ""
    }

    override fun color(id: Int): String {
        return colorMap[id] ?: ""
    }

    override fun dimen(id: Int): String {
        return dimenMap[id] ?: ""
    }
}