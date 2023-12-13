package in_myfiles.behavioral_pattern.chain_of_responsibility

/**
 * CHAIN OF RESPONSIBILITY PATTERN - IN MYFILES
 */

fun main(args: Array<String>) {
    val homeChain = HomeUtils.getHomeItemChain()
    homeChain.initLayout()
}