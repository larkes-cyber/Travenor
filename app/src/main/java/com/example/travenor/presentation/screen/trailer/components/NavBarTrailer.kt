package com.example.travenor.presentation.screen.trailer.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.travenor.presentation.theme.LightPrimaryBlue
import com.example.travenor.presentation.theme.OpacityPrimaryBlue

@Composable
fun NavBarTrailer(epoch:Int){
    Row(
        Modifier.width(72.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        //anti pattern TODO:fix classificate epoch to na1v trailer
        if(epoch == 1){
            NavBarTrailerItem(0.5f,true)
            NavBarTrailerItem(0.4f,false)
            NavBarTrailerItem(0.3f,false)
        }
        if(epoch == 2){
            NavBarTrailerItem(0.2f,false)
            NavBarTrailerItem(0.6f,true)
            NavBarTrailerItem(0.3f,false)
        }
        if(epoch == 3){
            NavBarTrailerItem(0.2f,false)
            NavBarTrailerItem(0.15f,false)
            NavBarTrailerItem(0.7f,true)
        }
    }
}

@Composable
fun NavBarTrailerItem(size:Float, main:Boolean){
    Card(
        modifier = Modifier
            .height(7.dp)
            .fillMaxWidth(size),
        shape = RoundedCornerShape(16.dp),
        backgroundColor = if(main) LightPrimaryBlue else OpacityPrimaryBlue
    ) {
    }
}
