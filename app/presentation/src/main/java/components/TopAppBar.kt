package components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.presentation.R

@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(24.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.plate),
            contentDescription = stringResource(
                R.string.cd_plate_logo
            ),
            modifier = modifier.size(40.dp)
        )

        Text(
            text = stringResource(R.string.welcome_home).trimIndent(),
            fontSize = 14.sp,
            modifier = modifier.fillMaxWidth(),
        )
    }
}

@Preview
@Composable
fun TopAppBarPreview() {
    TopAppBar()
}