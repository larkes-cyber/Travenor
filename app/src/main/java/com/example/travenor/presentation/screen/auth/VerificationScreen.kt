package com.example.travenor.presentation.screen.auth

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travenor.presentation.navigation.Screen
import com.example.travenor.presentation.screen.auth.components.*


@Composable
fun VerificationScreen(navController: NavController) {

    val firstVerField = remember {
        mutableStateOf(0)
    }
    val secondVerField = remember {
        mutableStateOf(0)
    }
    val thirdVerField = remember {
        mutableStateOf(0)
    }
    val fourthVerField = remember {
        mutableStateOf(0)
    }

    Box(Modifier.fillMaxSize()){
        Column(
            modifier = Modifier.padding(start = 17.dp, end = 17.dp, top = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AuthTitleComponent(title = "OTP Verification", size = 26)
            Spacer(modifier = Modifier.height(12.dp))
            AuthSubtitleComponent(subtitle = "Please check your email www.uihut@gmail.com to see the verification code", size = 16)
            Spacer(modifier = Modifier.height(40.dp))
            Column(Modifier
                .fillMaxWidth()) {
                Column(Modifier.fillMaxWidth()) {
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
                        AuthTitleComponent(title = "OTP Code", size = 20)
                    }
                    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                        Box(Modifier.width(70.dp)) {
                            AuthLoginFieldComponent(label = "", placeholder = "")
                        }
                        Box(Modifier.width(70.dp)) {
                            AuthLoginFieldComponent(label = "", placeholder = "")
                        }
                        Box(Modifier.width(70.dp)) {
                            AuthLoginFieldComponent(label = "", placeholder = "")
                        }
                        Box(Modifier.width(70.dp)) {
                            AuthLoginFieldComponent(label = "", placeholder = "")
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(40.dp))
            AuthButtonComponent(text = "Verify")
            Spacer(modifier = Modifier.height(16.dp))
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                AuthSubtitleComponent(subtitle = "Resend code to", size = 14)
                AuthSubtitleComponent(subtitle = "01:26", size = 14)
            }
        }
        Box(Modifier.padding(30.dp)) {
            AuthFloatingButton(route = Screen.ForgotPassword.route, navController = navController)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun Prev(){
    Column(Modifier
        .fillMaxWidth()
        .padding(horizontal = 20.dp)) {
        Column(Modifier.fillMaxWidth()) {
            AuthTitleComponent(title = "OTP Code", size = 20)
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Box(Modifier.width(70.dp)) {
                    AuthLoginFieldComponent(label = "", placeholder = "")
                }
                Box(Modifier.width(70.dp)) {
                    AuthLoginFieldComponent(label = "", placeholder = "")
                }
                Box(Modifier.width(70.dp)) {
                    AuthLoginFieldComponent(label = "", placeholder = "")
                }
                Box(Modifier.width(70.dp)) {
                    AuthLoginFieldComponent(label = "", placeholder = "")
                }
            }
        }
    }
}