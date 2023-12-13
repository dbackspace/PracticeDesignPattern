package in_myfiles.other_pattern.intercepting_filter

/**
 * INTERCEPTING FILTER - IN MYFILES
 * https://gpcoder.com/5158-huong-dan-java-design-pattern-intercepting-filter/
 */

fun main() {
    val source = Source()
    val target = Target()
    val filterManager = FilterManager(source, target)

    val fileRequestId = 1234L
    val listFileInfo = FileInfoFactory.createListFileInfo()
    val fileRequest = FileRequest(fileRequestId, listFileInfo)

    filterManager.addFileFilter(VerifyHiddenFileFilter())
    filterManager.addFileFilter(VerifyLocalStorageFileFilter())

    filterManager.execute(fileRequest)
}