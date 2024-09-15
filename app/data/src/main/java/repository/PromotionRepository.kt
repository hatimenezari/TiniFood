package repository

import datasource.local.entities.PromotionEntity

interface PromotionRepository {
    suspend fun getPromotions(): List<PromotionEntity>
    suspend fun prepopulateDatabase()
}