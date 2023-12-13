package in_myfiles.behavioral_pattern.strategy

import in_myfiles.behavioral_pattern.strategy.BehaviorType.DEFAULT
import in_myfiles.behavioral_pattern.strategy.BehaviorType.EXPANDABLE

object ListBehaviorFactory {
    fun createListBehavior(behaviorType: Int): FileListBehavior {
        return when (behaviorType) {
            DEFAULT -> DefaultListBehavior()
            EXPANDABLE -> ExpandableListBehavior()
            else -> CustomListBehavior()
        }
    }

}