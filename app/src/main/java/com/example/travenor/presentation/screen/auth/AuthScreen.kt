package com.example.travenor.presentation.screen.auth

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travenor.presentation.navigation.Screen
import com.example.travenor.presentation.screen.auth.components.*

@Composable
fun AuthScreen(navController: NavController) {

    val buttonState = remember{
        mutableStateOf(false)
    }

    Box(Modifier.fillMaxSize()){
        Column(
            Modifier
                .align(Alignment.BottomEnd)
                .padding(start = 20.dp, end = 20.dp, bottom = 30.dp)
        ) {
            Spacer(Modifier.height(40.dp))
            AuthTitleComponent(title = "Sign in now")
            Spacer(Modifier.height(12.dp))
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
                AuthSubtitleComponent(subtitle = "Please sign in to continue our app",size = 16)
            }
            Spacer(Modifier.height(25.dp))
            AuthLoginFieldComponent(label = "Enter your login", placeholder = "E-mail")
            Spacer(Modifier.height(20.dp))
            AuthPasswordFieldComponent()
            Spacer(Modifier.height(16.dp))
            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.BottomEnd){
                HighLightRedirectComponent(text = "Forget Password?", route = Screen.ForgotPassword.route, navController = navController)
            }
            Spacer(Modifier.height(40.dp))
            AuthButtonComponent("Sign In")
            Spacer(Modifier.height(40.dp))
            AuthFooterComponent(signUp = true, route = Screen.RegScreen.route, navController = navController)
        }
        Box(
            Modifier
                .align(Alignment.TopStart)
                .padding(30.dp)) {
            AuthFloatingButton()
        }
    }
}
