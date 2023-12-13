package in_myfiles.structural_pattern.decorator

class MultipleStorageDecoration : DecoratorOperation() {
    override fun doExtraOperation(): String {
        return "Multiple storage operation"
    }
}