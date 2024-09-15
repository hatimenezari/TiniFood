package database

import androidx.room.Database
import androidx.room.RoomDatabase
import database.dao.PromotionDao
import datasource.local.entities.PromotionEntity

@Database(entities = [PromotionEntity::class], version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun promotionDao(): PromotionDao
}