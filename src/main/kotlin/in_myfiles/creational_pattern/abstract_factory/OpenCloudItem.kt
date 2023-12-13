package in_myfiles.creational_pattern.abstract_factory

class OpenCloudItem : HomeItem {
    override fun showItem() {
        println("OpenCloudItem: supported Google Drive & One Drive cloud")
    }
}