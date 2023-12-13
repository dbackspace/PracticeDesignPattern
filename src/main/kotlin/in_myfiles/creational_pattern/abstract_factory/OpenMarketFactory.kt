package in_myfiles.creational_pattern.abstract_factory

class OpenMarketFactory : AbstractMarketFactory() {
    override fun createTrashItem(): HomeItem {
        return OpenTrashItem()
    }

    override fun createCloudItem(): HomeItem {
        return OpenCloudItem()
    }
}