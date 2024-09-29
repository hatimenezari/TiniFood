package screens.promotionscampaign.components

import Promotion
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun PromotionCampaignCard(
    promotion: Promotion,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier.fillMaxWidth()
    ) {
        AsyncImage(model = promotion.uri, contentDescription = null)
        Text(text = promotion.description, fontWeight = FontWeight.Bold)
        Text(text = "${promotion.startDate} - ${promotion.endDate}")
    }
}

@Preview(showBackground = true)
@Composable
fun PromotionPreview() {
    PromotionCampaignCard(promotion = Promotion(9))
}