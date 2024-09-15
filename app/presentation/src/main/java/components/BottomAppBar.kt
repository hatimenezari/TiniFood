package components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.presentation.R

@Composable
fun BottomAppBar(modifier: Modifier = Modifier) {
    BottomAppBar() {
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {

            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.home),
                    contentDescription = stringResource(R.string.cd_home_icon),
                    tint = Color.Cyan,
                    modifier = modifier.size(24.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.store),
                    contentDescription = stringResource(R.string.cd_store_icon),
                    modifier = modifier.size(24.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.order),
                    contentDescription = stringResource(R.string.cd_order_icon),
                    modifier = modifier.size(24.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = stringResource(R.string.cd_profile_icon),
                    modifier = modifier.size(24.dp)
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomAppBarPreview() {
    BottomAppBar()
}
