package usecase

import Promotion
import repository.PromotionRepository
import toDomainModel
import javax.inject.Inject

class GetPromotionsUseCase @Inject constructor(private val repository: PromotionRepository) {
    suspend operator fun invoke(): List<Promotion> {
        // Prepopulate database if empty
        repository.prepopulateDatabase()

        return repository.getPromotions().map { it.toDomainModel() }
    }
}