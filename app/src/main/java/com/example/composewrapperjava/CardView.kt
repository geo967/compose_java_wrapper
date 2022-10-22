package com.example.composewrapperjava

import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CardView(
    //onCardButtonClicked: () -> Unit
) {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .padding(1.dp, 1.dp)
            .width(200.dp)
            //.clickable { onCardButtonClicked.invoke() }
            .height(120.dp),
        shape = RoundedCornerShape(28.dp),
        elevation = 4.dp
    ) {
        Surface(
            color = Color.Blue,
            onClick = {
                val intent = Intent(context, MainActivity2::class.java)
                context.startActivity(intent)
            }) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(1.dp)
                    .width(100.dp)
                    .height(100.dp)

            ) {
                Text(
                    text = "Clouds : ",
                    style = MaterialTheme.typography.subtitle1,
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun UserCardPreview() {
    CardView()//onCardButtonClicked = {})
}