package com.example.travenor.presentation.screen.auth.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travenor.R

@Composable
fun AuthFooterComponent(signUp:Boolean, route:String, navController: NavController) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.align(Alignment.CenterHorizontally)) {
            Column(
                Modifier.fillMaxWidth(0.5f),
                horizontalAlignment = Alignment.End
            ){
                AuthSubtitleComponent(subtitle = if(signUp) "Don’t have an account?" else "Already have an account", size = 14)
            }
            Spacer(modifier = Modifier.fillMaxWidth(0.05f))
            Column(
                Modifier.fillMaxWidth(0.6f),
                horizontalAlignment = Alignment.Start
            ){
                HighLightRedirectComponent(text = if(signUp) "Sign up" else "Sign in" , route = route, navController = navController)
            }
        }
        Spacer(Modifier.height(20.dp))
        Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            AuthSubtitleComponent(subtitle = "Or connect", size = 14)
        }
        Spacer(Modifier.height(36.dp))
        Row(
            Modifier
                .align(Alignment.CenterHorizontally)
                .width(180.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            SocialIcon(R.drawable.facebook)
            SocialIcon(R.drawable.instagram)
            SocialIcon(R.drawable.twitter)
        }
    }
}

@Composable
fun SocialIcon(drawable:Int){
    Image(
        painterResource(id = drawable),
        contentDescription = "",
        modifier = Modifier.width(44.dp).height(44.dp),
        contentScale = ContentScale.Crop
    )
}