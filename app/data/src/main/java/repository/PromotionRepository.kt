package repository

import datasource.local.PromotionLocalDataSource
import datasource.local.entities.PromotionEntity
import datasource.remote.PromotionRemoteDataSource
import datasource.remote.entities.PromotionApiEntity

interface PromotionRepository {
    suspend fun getPromotions(): List<PromotionEntity>
    suspend fun getCampaignPromotions(): List<PromotionApiEntity>
    suspend fun prepopulateDatabase()
}

class PromotionRepositoryImpl(
    private val localDataSource: PromotionLocalDataSource,
    private val remoteDataSource: PromotionRemoteDataSource
) : PromotionRepository {

    override suspend fun getPromotions(): List<PromotionEntity> {
        return localDataSource.getPromotions()
    }

    override suspend fun getCampaignPromotions(): List<PromotionApiEntity> {
        return remoteDataSource.getRemotePromotions()
    }

    override suspend fun prepopulateDatabase() {
        localDataSource.prepopulateDatabase()
    }
}