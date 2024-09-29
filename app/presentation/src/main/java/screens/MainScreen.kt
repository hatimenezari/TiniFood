package screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import components.bottomappbar.BottomAppBar
import kotlinx.serialization.Serializable
import screens.home.Home
import screens.promotionscampaign.Promotions


@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomAppBar(modifier, navController) }
    ) { paddingValues ->
        NavHost(navController = navController, startDestination = Home) {
            composable<Home> { Home(modifier, paddingValues) }
            composable<PromotionsCampaign> { Promotions(modifier, paddingValues) }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}

//navigation

@Serializable
object Home

@Serializable
object PromotionsCampaign