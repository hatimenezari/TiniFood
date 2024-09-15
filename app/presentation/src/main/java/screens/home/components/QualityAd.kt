package screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.presentation.R

@Composable
fun QualityAd(modifier: Modifier = Modifier) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .height(150.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
    ) {
        Row(
            modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column {
                Image(
                    painter = painterResource(id = R.drawable.quality),
                    contentDescription = stringResource(
                        R.string.cd_store_image
                    ),
                    modifier = modifier.size(80.dp)
                )
                Text(
                    text = stringResource(R.string.store_pickup),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    text = "Best quality",
                    fontSize = 12.sp,
                )
            }
            VerticalDivider(
                thickness = 1.dp,
            )
            Column {
                Image(
                    painter = painterResource(id = R.drawable.bike),
                    contentDescription = stringResource(R.string.cd_bike_image),
                    modifier = modifier.size(80.dp)
                )
                Text(
                    text = "Delivery",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
                Text(
                    text = "Always on time",
                    fontSize = 12.sp
                )
            }
        }
    }
}


@Preview
@Composable
fun QualityAdPreview() {
    QualityAd()
}