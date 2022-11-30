package com.example.travenor.presentation.screen.trailer.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travenor.presentation.theme.SubtitleColor
import com.example.travenor.presentation.theme.geometr
import com.example.travenor.presentation.theme.gillsans

@Composable
fun SubtitleTrailerComponent(subtitle:String) {
    Text(
        text = subtitle,
        color = SubtitleColor,
        style = TextStyle(
            fontSize = 16.sp
        ),
        fontFamily = gillsans,
        fontWeight = FontWeight.Black,
        fontStyle = FontStyle.Normal,
        modifier = Modifier.padding(start = 50.dp, end = 37.dp),
        textAlign = TextAlign.Center
    )
}