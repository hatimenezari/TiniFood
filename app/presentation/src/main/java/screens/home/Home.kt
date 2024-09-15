package screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import components.TopAppBar
import screens.home.components.PromoCarousel
import screens.home.components.QualityAd


@Composable
fun Home(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues,
    viewModel: HomeViewModel = hiltViewModel()
) {

    val promotions by viewModel.promotions.collectAsState()

    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(paddingValues)
            .fillMaxSize()
    ) {
        TopAppBar(modifier = modifier)
        PromoCarousel(modifier = modifier, promotions)
        QualityAd(modifier = modifier)
    }
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    Home(paddingValues = PaddingValues(5.dp))
}
