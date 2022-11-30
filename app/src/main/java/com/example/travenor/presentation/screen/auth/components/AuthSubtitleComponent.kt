package com.example.travenor.presentation.screen.auth.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.travenor.presentation.theme.SubtitleColor
import com.example.travenor.presentation.theme.sfuidisplay

@Composable
fun AuthSubtitleComponent(subtitle:String,size:Int) {
    Text(
        text = subtitle,
        color = SubtitleColor,
        fontFamily = sfuidisplay,
        fontWeight = FontWeight.Normal,
        fontSize = size.sp,
        fontStyle = FontStyle.Normal,
        textAlign = TextAlign.Center
    )
}