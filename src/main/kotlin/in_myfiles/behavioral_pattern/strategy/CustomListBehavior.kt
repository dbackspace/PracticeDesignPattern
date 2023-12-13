package in_myfiles.behavioral_pattern.strategy

class CustomListBehavior : DefaultListBehavior() {
    override fun updateItems(items: List<String>) {
        println("Custom list behavior - update items: completed")
    }
}