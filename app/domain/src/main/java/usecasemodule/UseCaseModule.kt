package usecasemodule

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import repository.PromotionRepository
import usecase.GetPromotionsUseCase

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetPromotionsUseCase(repository: PromotionRepository): GetPromotionsUseCase {
        return GetPromotionsUseCase(repository)
    }
}