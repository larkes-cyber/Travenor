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
fun ForgotPasswordScreen(navController: NavController) {

    val alertDialogState = remember {
        mutableStateOf(false)
    }

    Box(Modifier.fillMaxSize()){
        Column(
            Modifier.padding(start = 20.dp, end = 20.dp, top = 152.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                AuthTitleComponent(title = "Forgot password",26)
            }
            Spacer(modifier = Modifier.height(12.dp))
            AuthSubtitleComponent(subtitle = "Enter your email account to reset your password", size = 16)
            Spacer(modifier = Modifier.height(30.dp))
            AuthLoginFieldComponent(label = "Enter your email", placeholder = "E-mail")
            Spacer(modifier = Modifier.height(40.dp))
            AuthButtonComponent(text = "Reset Password", alertDialogState)
            AuthAlertDialogComponent(alertDialogState, route = Screen.VerificationScreen.route, navController = navController)
        }
        Box(Modifier.padding(30.dp)){
            AuthFloatingButton(route = Screen.AuthScreen.route, navController = navController)
        }

    }
}