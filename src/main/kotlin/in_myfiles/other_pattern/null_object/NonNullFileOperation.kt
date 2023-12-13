package in_myfiles.other_pattern.null_object

class NonNullFileOperation : IFileOperation {
    override fun prepareOperation() {
        // throw IllegalStateException("prepareOperation - NOT SUPPORTED")
        println("prepareOperation - DO NOTHING")
    }

    override fun createParams(): RWParam {
        // throw IllegalStateException("createParams - NOT SUPPORTED")
        println("createParams - DO NOTHING AND RETURN DEFAULT OBJECT")
        return RWParam()
    }
}