package screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.presentation.R

@Composable
fun ReservationCard(
    modifier: Modifier = Modifier,
) {

    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .height(180.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier
                    .padding(horizontal = 16.dp)
            ) {
                Column(
                    modifier = modifier
                        .weight(0.6f)
                ) {
                    Text(
                        text = stringResource(R.string.online_reservation),
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                    )
                    Text(
                        text = stringResource(R.string.table_booking),
                        fontSize = 12.sp,
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.table),
                    contentDescription = stringResource(
                        R.string.cd_table_logo
                    ),
                    modifier = modifier
                        .size(height = 100.dp, width = 72.dp)
                        .weight(0.4f)
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text(text = "Reserve a table", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
                OutlinedButton(onClick = { /*TODO*/ }) {
                    Text(text = "My reservations", fontSize = 12.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ReservationPreview() {
    ReservationCard()
}