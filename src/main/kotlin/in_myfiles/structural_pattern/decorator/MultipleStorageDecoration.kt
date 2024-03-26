package in_myfiles.structural_pattern.decorator

class MultipleStorageDecoration(decorator: IFileOperation?) : DecoratorOperation(decorator) {
    override fun doExtraOperation(): String {
        return "Multiple storage operation"
    }
}