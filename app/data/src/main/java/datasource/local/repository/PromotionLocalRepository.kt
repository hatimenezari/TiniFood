package datasource.local.repository

import datasource.local.PromotionLocalDataSource
import datasource.local.entities.PromotionEntity
import repository.PromotionRepository

class PromotionLocalRepository(
    private val localDataSource: PromotionLocalDataSource
) : PromotionRepository {

    override suspend fun getPromotions(): List<PromotionEntity> {
        return localDataSource.getPromotions()
    }

    override suspend fun prepopulateDatabase() {
        localDataSource.prepopulateDatabase()
    }
}