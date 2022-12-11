package com.example.travenor.presentation.screen.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travenor.R
import com.example.travenor.presentation.theme.*

@Preview
@Composable
fun ProfileNavHomeComponent(
    name:String = "Leonardo",
    image:Int = R.drawable.random_dude
) {
    Card(
        backgroundColor = InputBoxColor,
        shape = RoundedCornerShape(22.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 4.dp, top = 6.dp, bottom = 5.dp, end = 12.dp)
        ) {
            Image(
                painterResource(id = image),
                contentDescription = "",
                modifier = Modifier
                    .height(37.dp)
                    .width(37.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = name,
                color = TitleColor,
                style = TextStyle(
                    fontSize = 16.sp
                ),
                fontFamily = sfuidisplay,
                fontWeight = FontWeight.Medium,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.Center
            )
        }
    }

}