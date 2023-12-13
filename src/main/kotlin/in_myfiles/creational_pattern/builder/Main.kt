package in_myfiles.creational_pattern.builder

/**
 * BUILDER PATTERN - IN MYFILES
 */

fun main(args: Array<String>) {
    DialogBuilder().setTitle("Move 1 file to Trash")
        .setMessage("If you move to Trash, this file also moved to Gallery Trash")
        .setPositiveButton("Move to Trash")
        .setNeutralButton("Delete permanently")
        .setNegativeButton("Cancel")
        .build()
}