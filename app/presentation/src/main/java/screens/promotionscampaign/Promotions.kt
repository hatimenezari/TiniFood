package screens.promotionscampaign

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import screens.promotionscampaign.components.PromotionCampaignCard

@Composable
fun Promotions(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues,
    viewModel: PromotionsViewModel = hiltViewModel()
) {
    val promotions by viewModel.promotions.collectAsState()

    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
            .padding(paddingValues)
            .padding(16.dp)
    ) {
        Text(text = "Promotion campaign", fontWeight = FontWeight.Bold, fontSize = 24.sp)
        LazyVerticalGrid(
            columns = GridCells.Adaptive(156.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier.wrapContentHeight()
        ) {
            items(promotions, key = { it.id }) { promotion ->
                PromotionCampaignCard(promotion = promotion, modifier = modifier)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PromotionsPreview() {
    Promotions(paddingValues = PaddingValues(5.dp))
}