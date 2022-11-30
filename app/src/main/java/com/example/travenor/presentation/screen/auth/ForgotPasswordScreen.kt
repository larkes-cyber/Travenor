package com.example.travenor.presentation.screen.auth

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travenor.presentation.screen.auth.components.*

@Composable
fun ForgotPasswordScreen(navController: NavController) {
    Box(Modifier.fillMaxSize()){
        Column(
            Modifier.padding(start = 20.dp, end = 20.dp, top = 152.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AuthTitleComponent(title = "Forgot password")
            Spacer(modifier = Modifier.height(12.dp))
            AuthSubtitleComponent(subtitle = "Enter your email account to reset your password", size = 16)
            Spacer(modifier = Modifier.height(30.dp))
            AuthLoginFieldComponent(label = "Enter your email", placeholder = "E-mail")
            Spacer(modifier = Modifier.height(40.dp))
            AuthButtonComponent(text = "Reset Password")
        }
        Box(Modifier.padding(30.dp)){
            AuthFloatingButton()
        }

    }
}