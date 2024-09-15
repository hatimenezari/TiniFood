package datasource.local

import database.dao.PromotionDao
import datasource.local.entities.PromotionEntity

class PromotionLocalDataSource(private val dao: PromotionDao) {
    suspend fun getPromotions(): List<PromotionEntity> = dao.getAllPromotions()

    suspend fun insertPromotions(promotions: List<PromotionEntity>) {
        dao.insertPromotions(promotions)
    }

    suspend fun prepopulateDatabase() {
        val count = dao.getPromotionsCount()
        if (count == 0) {
            val promotions = listOf(
                PromotionEntity(uri = "https://raw.githubusercontent.com/hatimenezari/TiniFood/develop/promoImg.png"),
                PromotionEntity(uri = "https://raw.githubusercontent.com/hatimenezari/TiniFood/develop/promoImg.png"),
                PromotionEntity(uri = "https://raw.githubusercontent.com/hatimenezari/TiniFood/develop/promoImg.png"),
                PromotionEntity(uri = "https://raw.githubusercontent.com/hatimenezari/TiniFood/develop/promoImg.png"),
                PromotionEntity(uri = "https://raw.githubusercontent.com/hatimenezari/TiniFood/develop/promoImg.png"),
                PromotionEntity(uri = "https://raw.githubusercontent.com/hatimenezari/TiniFood/develop/promoImg.png"),
            )
            insertPromotions(promotions)
        }
    }
}

