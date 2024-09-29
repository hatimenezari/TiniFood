package components.bottomappbar

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

enum class HIGHLIGHTED_TAB {
    HOME, PROFILE, ORDER, PROMOTIONS
}

@HiltViewModel
class BottomAppBarViewmodel @Inject constructor() : ViewModel() {
    private val _highlightedTab = mutableStateOf(HIGHLIGHTED_TAB.HOME)
    val highlightedTab: State<HIGHLIGHTED_TAB> get() = _highlightedTab

    fun updateTab(tab: HIGHLIGHTED_TAB) {
        _highlightedTab.value = tab
    }
}