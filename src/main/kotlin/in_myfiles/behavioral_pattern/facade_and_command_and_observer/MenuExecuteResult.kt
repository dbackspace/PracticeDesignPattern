package in_myfiles.behavioral_pattern.facade_and_command_and_observer

data class MenuExecuteResult(
    var menuType: Int = MenuType.UNDEFINED,
    var isSuccess: Boolean = false,
    var isCancelled: Boolean = false,
    var needRefresh: Boolean = false
)