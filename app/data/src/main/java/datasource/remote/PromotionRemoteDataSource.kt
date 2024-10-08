package datasource.remote

import datasource.remote.entities.PromotionApiEntity
import datasource.remote.service.PromotionApiService
import javax.inject.Inject

class PromotionRemoteDataSource @Inject constructor(
    private val promotionService: PromotionApiService
) {
    suspend fun getRemotePromotions(): List<PromotionApiEntity> {
        return promotionService.getPromotions()
    }
}

