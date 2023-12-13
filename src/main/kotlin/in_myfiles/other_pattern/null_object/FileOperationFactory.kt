package in_myfiles.other_pattern.null_object

import in_myfiles.other_pattern.null_object.FileOperationFactory.DomainType.CLOUD
import in_myfiles.other_pattern.null_object.FileOperationFactory.DomainType.LOCAL

object FileOperationFactory {

    private val fileOperationMap = hashMapOf(
        LOCAL to LocalFileOperation(),
        CLOUD to CloudFileOperation()
    )

    fun getFileOperation(domainType: Int): IFileOperation {
        return fileOperationMap[domainType] ?: NonNullFileOperation()
    }

    object DomainType {
        const val UNKNOWN = -1
        const val LOCAL = 0
        const val CLOUD = 1
    }
}