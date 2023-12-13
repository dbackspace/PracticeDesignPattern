package in_myfiles.behavioral_pattern.facade_and_command_and_observer

/**
 * FACADE + COMMAND + OBSERVER PATTERN - IN MYFILES
 */

fun main(args: Array<String>) {
    val menuType = MenuType.MOVE
    FileListController().handleExecuteMenu(menuType)
}