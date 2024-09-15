package screens.home.components

import Promo
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PromoCarousel(modifier: Modifier) {

    //TODO fetch list
    val promos = mutableListOf(
        Promo(1),
        Promo(2),
        Promo(3),
        Promo(4)
    )

    val state = rememberLazyListState()

    LazyRow(
        state = state,
        modifier = modifier
            .padding(top = 8.dp)
            .height(130.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(
            start = 16.dp,
            end = 16.dp
        )
    ) {
        items(promos, key = { it.id }) { promo ->
            PromoCard(promo)
        }
    }
}