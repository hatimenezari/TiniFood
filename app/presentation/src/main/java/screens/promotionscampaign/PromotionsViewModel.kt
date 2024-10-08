package screens.promotionscampaign

import Promotion
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import usecase.GetCampaignPromotionsUseCase
import javax.inject.Inject

@HiltViewModel
class PromotionsViewModel @Inject constructor(
    private val getCampaignPromotionsUseCase: GetCampaignPromotionsUseCase
) : ViewModel() {
    private val _promotions = MutableStateFlow<List<Promotion>>(emptyList())
    val promotions: StateFlow<List<Promotion>> = _promotions

    init {
        viewModelScope.launch {
            _promotions.value = getCampaignPromotionsUseCase()
        }
    }
}