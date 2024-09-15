package hiltmodules

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import database.AppDatabase
import database.dao.PromotionDao
import datasource.local.PromotionLocalDataSource

@Module
@InstallIn(SingletonComponent::class)
object DBModule {

    @Provides
    fun provideDatabase(app: Application): AppDatabase {
        return Room.databaseBuilder(
            app,
            AppDatabase::class.java,
            "promotions.db"
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun providePromotionDao(database: AppDatabase): PromotionDao {
        return database.promotionDao()
    }

    @Provides
    fun provideLocalDataSource(dao: PromotionDao): PromotionLocalDataSource {
        return PromotionLocalDataSource(dao)
    }
}