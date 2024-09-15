package usecase

import Promotion
import repository.PromotionRepository
import toDomainModel

class GetPromotionsUseCase(private val repository: PromotionRepository) {
    suspend operator fun invoke(): List<Promotion> {
        // Prepopulate database if empty
        repository.prepopulateDatabase()

        return repository.getPromotions().map { it.toDomainModel() }
    }
}