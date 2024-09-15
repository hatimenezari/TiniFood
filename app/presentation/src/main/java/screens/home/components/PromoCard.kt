package screens.home.components

import Promotion
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun PromoCard(promotion: Promotion, modifier: Modifier = Modifier) {
    AsyncImage(
        model = promotion.uri,
        contentDescription = null,
        modifier = modifier.fillMaxSize()
    )
}

@Preview(showBackground = true)
@Composable
fun PromoCardPreview() {
    PromoCard(Promotion(9))
}