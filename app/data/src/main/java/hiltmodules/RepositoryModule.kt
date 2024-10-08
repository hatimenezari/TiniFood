package hiltmodules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import datasource.local.PromotionLocalDataSource
import datasource.remote.PromotionRemoteDataSource
import repository.PromotionRepository
import repository.PromotionRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun providePromotionRepository(
        localDataSource: PromotionLocalDataSource,
        remoteDataSource: PromotionRemoteDataSource
    ): PromotionRepository {
        return PromotionRepositoryImpl(localDataSource, remoteDataSource)
    }
}