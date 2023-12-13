package in_myfiles.behavioral_pattern.strategy

class ExpandableListBehavior : DefaultListBehavior() {
    override fun updateItems(items: List<String>) {
        println("Expandable list behavior - update items: completed")
    }
}