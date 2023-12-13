package in_myfiles.creational_pattern.abstract_factory

object MarketFactory {
    fun getMarketFactory(factoryType: FactoryType): AbstractMarketFactory {
        return when (factoryType) {
            FactoryType.OPEN -> OpenMarketFactory()
            FactoryType.CHINA -> ChinaMarketFactory()
        }
    }
}