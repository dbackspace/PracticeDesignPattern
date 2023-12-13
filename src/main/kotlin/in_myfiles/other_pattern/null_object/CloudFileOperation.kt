package in_myfiles.other_pattern.null_object

class CloudFileOperation : IFileOperation {
    override fun prepareOperation() {
        println("Prepare operation - CloudFileOperation")
    }

    override fun createParams(): RWParam {
        return RWParam("sourceCloudFileName", "destinationCloudFileName", "cloudFileExtension")
    }
}