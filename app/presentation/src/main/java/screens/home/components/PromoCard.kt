package screens.home.components

import Promo
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun PromoCard(promo: Promo, modifier: Modifier = Modifier) {
    AsyncImage(
        model = promo.uri,
        contentDescription = null,
        modifier = modifier.fillMaxSize()
    )
}

@Preview(showBackground = true)
@Composable
fun PromoCardPreview() {
    PromoCard(Promo(9))
}