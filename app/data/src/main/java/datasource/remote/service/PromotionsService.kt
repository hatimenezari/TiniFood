package datasource.remote.service

import datasource.remote.entities.PromotionApiEntity
import retrofit2.http.GET

interface PromotionApiService {
    @GET("promotions")
    suspend fun getPromotions(): List<PromotionApiEntity>
}