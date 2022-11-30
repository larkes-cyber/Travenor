package com.example.travenor.presentation.screen.trailer.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.travenor.R
import com.example.travenor.presentation.screen.trailer.TrailerModel
import com.example.travenor.presentation.theme.HighLightColor
import com.example.travenor.presentation.theme.TitleColor
import com.example.travenor.presentation.theme.geometr


@Composable
fun TitleTrailerComponent(title:String) {

    val words = title.split(" ").toMutableList()
    val lastWord =" " + words[words.size-1]
    words.removeAt(words.size-1)

    SelectionContainer(content = {
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(color = TitleColor, fontSize = 30.sp, fontFamily = geometr, fontWeight = FontWeight.Black)){
                    append(words.joinToString(separator = " "))
                }
                withStyle(style = SpanStyle(color = HighLightColor, fontSize = 30.sp, fontFamily = geometr, fontWeight = FontWeight.Black)){
                    append(lastWord)
                }
            },
            textAlign = TextAlign.Center
        )
    }, modifier = Modifier.padding(start = 20.dp, end = 37.dp))

}

