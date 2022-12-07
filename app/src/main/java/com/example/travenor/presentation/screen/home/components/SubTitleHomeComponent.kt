package com.example.travenor.presentation.screen.home.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.travenor.presentation.theme.SubtitleColor
import com.example.travenor.presentation.theme.TitleColor
import com.example.travenor.presentation.theme.sfuidisplay

@Composable
fun SubTitleHomeComponent(title:String, size:Int) {
    Text(
        text = title,
        fontFamily = sfuidisplay,
        fontSize = size.sp,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        color = SubtitleColor
    )
}