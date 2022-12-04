package com.example.travenor.presentation.screen.home.components

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travenor.presentation.theme.TitleColor
import com.example.travenor.presentation.theme.sfuidisplay

@Composable
fun TitleHomeComponent(title:String, size:Int) {
    Text(
        text = title,
        fontFamily = sfuidisplay,
        fontSize = size.sp,
        fontWeight = FontWeight.SemiBold,
        fontStyle = FontStyle.Normal,
        color = TitleColor
    )
}
