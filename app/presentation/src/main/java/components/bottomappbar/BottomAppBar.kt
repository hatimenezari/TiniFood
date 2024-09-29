package components.bottomappbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.presentation.R
import screens.Home
import screens.PromotionsCampaign

@Composable
fun BottomAppBar(
    modifier: Modifier = Modifier,
    navController: NavController,
    viewmodel: BottomAppBarViewmodel = hiltViewModel()
) {

    val highlightedTab by viewmodel.highlightedTab

    BottomAppBar() {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            IconButton(onClick = {
                navController.navigate(Home).also { viewmodel.updateTab(HIGHLIGHTED_TAB.HOME) }
            }) {
                Icon(
                    painter = painterResource(id = R.drawable.home),
                    contentDescription = stringResource(R.string.cd_home_icon),
                    tint = if (highlightedTab == HIGHLIGHTED_TAB.HOME) Color.Cyan else Color.Unspecified,
                    modifier = modifier.size(24.dp)
                )
            }
            IconButton(onClick = {
                navController.navigate(PromotionsCampaign)
                    .also { viewmodel.updateTab(HIGHLIGHTED_TAB.PROMOTIONS) }
            }) {
                Icon(
                    painter = painterResource(id = R.drawable.promotions),
                    contentDescription = stringResource(R.string.cd_store_icon),
                    tint = if (highlightedTab == HIGHLIGHTED_TAB.PROMOTIONS) Color.Cyan else Color.Unspecified,
                    modifier = modifier.size(24.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.order),
                    contentDescription = stringResource(R.string.cd_order_icon),
                    tint = if (highlightedTab == HIGHLIGHTED_TAB.ORDER) Color.Cyan else Color.Unspecified,
                    modifier = modifier.size(24.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = stringResource(R.string.cd_profile_icon),
                    tint = if (highlightedTab == HIGHLIGHTED_TAB.PROFILE) Color.Cyan else Color.Unspecified,
                    modifier = modifier.size(24.dp)
                )
            }

        }
    }
}
