package usecase

import Promotion
import repository.PromotionRepository
import toDomainModel
import javax.inject.Inject

class GetCampaignPromotionsUseCase @Inject constructor(
    private val repository: PromotionRepository
) {
    suspend operator fun invoke(): List<Promotion> {
        return repository.getCampaignPromotions().map { it.toDomainModel() }
    }
}