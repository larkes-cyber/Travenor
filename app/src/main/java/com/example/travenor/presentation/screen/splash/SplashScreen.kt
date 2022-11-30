package com.example.travenor.presentation.screen.splash

import android.os.Handler
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.travenor.presentation.navigation.Screen
import com.example.travenor.presentation.theme.LightPrimaryBlue
import com.example.travenor.presentation.theme.geometr

@Composable
fun SplashScreen(navController: NavController){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(LightPrimaryBlue)
    ){
        Text(
            text = "Travenor",
            color = Color.White,
            style = TextStyle(
                fontSize = 34.sp
            ),
            fontFamily = geometr,
            fontWeight = FontWeight.Black,
            fontStyle = FontStyle.Normal,
            modifier = Modifier.align(Alignment.Center)
        )
    }
    val handler = Handler()
    var flag = true
    Log.d("imfoolllll","im here")
    LaunchedEffect(true){
            handler.postDelayed({
                    navController.navigate(Screen.TrailerScreen.route)
         }, 2000)
    }

 //   navController.navigate(Screen.TrailerScreen.route)
  //
}