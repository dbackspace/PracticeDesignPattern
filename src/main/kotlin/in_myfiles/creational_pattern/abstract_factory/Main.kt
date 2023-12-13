package in_myfiles.creational_pattern.abstract_factory

/**
 * ABSTRACT FACTORY PATTERN - IN MYFILES
 */

fun main(args: Array<String>) {
    val factoryType = FactoryType.CHINA
    val marketFactory = MarketFactory.getMarketFactory(factoryType)
    marketFactory.createTrashItem().showItem()
    marketFactory.createCloudItem().showItem()
}