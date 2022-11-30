package com.example.travenor.presentation.screen.auth.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.travenor.presentation.theme.LightPrimaryBlue
import com.example.travenor.presentation.theme.sfuidisplay

@Composable
fun HighLightRedirectComponent(text:String, route:String, navController: NavController) {

    ClickableText(
        text = AnnotatedString(text),
        style = TextStyle(
            fontSize = 14.sp,
            color = LightPrimaryBlue,
            fontFamily = sfuidisplay,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.End
        ),
        onClick = {
            navController.navigate(route)
        }
    )
}