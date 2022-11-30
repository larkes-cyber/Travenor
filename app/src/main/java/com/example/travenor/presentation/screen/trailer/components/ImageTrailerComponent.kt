package com.example.travenor.presentation.screen.trailer.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import com.example.travenor.R

@Composable
fun ImageTrailerComponent(drawable:Int){

    Card(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(0.5f),
        shape = RoundedCornerShape(bottomEnd = 30.dp, bottomStart = 30.dp),
        backgroundColor = Color.Black
    ) {

        Image(
            painterResource(id = drawable),
            contentDescription = "",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

    }

}