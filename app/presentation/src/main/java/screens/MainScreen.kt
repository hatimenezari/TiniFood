package screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import components.BottomAppBar
import screens.home.Home

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = { BottomAppBar() }
    ) { paddingValues ->
        Home(modifier, paddingValues)
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}