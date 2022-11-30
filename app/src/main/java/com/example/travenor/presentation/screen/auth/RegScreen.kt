package com.example.travenor.presentation.screen.auth

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travenor.presentation.navigation.Screen
import com.example.travenor.presentation.screen.auth.components.*

@Composable
fun RegScreen(navController: NavController) {
    Box(Modifier.fillMaxSize()){
        Column(
            Modifier
                .align(Alignment.BottomEnd)
                .padding(start = 20.dp, end = 20.dp, bottom = 30.dp)
        ) {
            AuthTitleComponent(title = "Sign up now")
            Spacer(Modifier.height(12.dp))
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                AuthSubtitleComponent(subtitle = "Please fill the details and create account",size = 16)
            }
            Spacer(Modifier.height(25.dp))
            AuthLoginFieldComponent("Enter your name","Name")
            Spacer(Modifier.height(13.dp))
            AuthLoginFieldComponent("Enter your login","E-mail")
            Spacer(Modifier.height(13.dp))
            AuthPasswordFieldComponent()
            Spacer(Modifier.height(30.dp))
            AuthButtonComponent("Sign Up")
            Spacer(Modifier.height(30.dp))
            AuthFooterComponent(signUp = false, route = Screen.SplashScreen.route, navController = navController)
        }
        Box(
            Modifier
                .align(Alignment.TopStart)
                .padding(30.dp)) {
            AuthFloatingButton()
        }
    }
}