package in_myfiles.behavioral_pattern.strategy

/**
 * STRATEGY PATTERN - IN MYFILES
 */

fun main(args: Array<String>) {
    val listBehavior = ListBehaviorFactory.createListBehavior(BehaviorType.EXPANDABLE)
    listBehavior.initListener()
    listBehavior.notifyListAdapter()
}