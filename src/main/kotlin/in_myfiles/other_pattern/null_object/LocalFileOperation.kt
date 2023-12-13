package in_myfiles.other_pattern.null_object

class LocalFileOperation : IFileOperation {
    override fun prepareOperation() {
        println("Prepare operation - LocalFileOperation")
    }

    override fun createParams(): RWParam {
        return RWParam("sourceLocalFileName", "destinationLocalFileName", "localFileExtension")
    }
}