package com.example.travenor.presentation.screen.auth.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.travenor.presentation.theme.TitleColor
import com.example.travenor.presentation.theme.sfuidisplay

@Composable
fun AuthTitleComponent(title:String) {
    Text(
        text = title,
        color = TitleColor,
        style = TextStyle(
            fontSize = 26.sp
        ),
        fontFamily = sfuidisplay,
        fontWeight = FontWeight.SemiBold,
        fontStyle = FontStyle.Normal,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
}