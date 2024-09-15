package database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import datasource.local.entities.PromotionEntity

@Dao
interface PromotionDao {
    @Query("SELECT * FROM promotions")
    suspend fun getAllPromotions(): List<PromotionEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPromotions(promotions: List<PromotionEntity>)

    @Query("SELECT COUNT(*) FROM promotions")
    suspend fun getPromotionsCount(): Int


}