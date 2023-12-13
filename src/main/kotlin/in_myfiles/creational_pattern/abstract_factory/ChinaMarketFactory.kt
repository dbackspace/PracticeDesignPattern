package in_myfiles.creational_pattern.abstract_factory

class ChinaMarketFactory : AbstractMarketFactory() {
    override fun createTrashItem(): HomeItem {
        return ChinaTrashItem()
    }

    override fun createCloudItem(): HomeItem {
        return ChinaCloudItem()
    }
}