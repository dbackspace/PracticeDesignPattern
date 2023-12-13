package in_myfiles.creational_pattern.abstract_factory

abstract class AbstractMarketFactory {
    abstract fun createTrashItem(): HomeItem
    abstract fun createCloudItem(): HomeItem
}