package hiltmodules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import datasource.local.PromotionLocalDataSource
import datasource.local.repository.PromotionLocalRepository
import repository.PromotionRepository

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun providePromotionRepository(
        localDataSource: PromotionLocalDataSource
    ): PromotionRepository {
        return PromotionLocalRepository(localDataSource)
    }
}