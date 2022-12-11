package com.example.travenor.presentation.screen.home.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travenor.presentation.theme.HighLightColor
import com.example.travenor.presentation.theme.TitleColor
import com.example.travenor.presentation.theme.geometr
import com.example.travenor.presentation.theme.sfuidisplay

@Composable
fun PromoHomeComponent(title:String) {
    val words = title.split(" ").toMutableList()
    val beforeLastWord = " " + words[words.size- 2]
    val lastWord =" " + words[words.size-1]

    words.removeAt(words.size-1)
    words.removeAt(words.size-1)

    SelectionContainer(content = {
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = TitleColor, fontSize = 38.sp, fontFamily = sfuidisplay, fontWeight = FontWeight.Normal)){
                    append(words.joinToString(separator = " "))
                }
                withStyle(style = SpanStyle(color = TitleColor, fontSize = 38.sp, fontFamily = sfuidisplay, fontWeight = FontWeight.SemiBold)){
                    append(beforeLastWord)
                }
                withStyle(style = SpanStyle(color = HighLightColor, fontSize = 38.sp, fontFamily = sfuidisplay, fontWeight = FontWeight.SemiBold)){
                    append(lastWord)
                }
            },
            textAlign = TextAlign.Start,
            lineHeight = 46.sp
        )
    })
}