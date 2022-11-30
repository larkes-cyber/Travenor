package com.example.travenor.presentation

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.travenor.presentation.navigation.Screen
import com.example.travenor.presentation.screen.auth.AuthScreen
import com.example.travenor.presentation.screen.auth.ForgotPasswordScreen
import com.example.travenor.presentation.screen.auth.RegScreen
import com.example.travenor.presentation.screen.splash.SplashScreen
import com.example.travenor.presentation.screen.trailer.TrailerScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.SplashScreen.route){
        composable(route = Screen.SplashScreen.route){
            SplashScreen(navController = navController)
        }
        composable(route = Screen.TrailerScreen.route){
            BackHandler(true) {
            }
            TrailerScreen(navController = navController)
        }
        composable(route = Screen.AuthScreen.route){
            AuthScreen(navController = navController)
        }
        composable(route = Screen.RegScreen.route){
            RegScreen(navController = navController)
        }
        composable(route = Screen.ForgotPassword.route){
            ForgotPasswordScreen(navController = navController)
        }

    }

}

//@Composable
//fun SplashScreen(navController: NavController){
//    Column(Modifier.fillMaxSize()) {
//        Text("first", modifier = Modifier.align(Alignment.CenterHorizontally))
//        Spacer(modifier = Modifier.height(15.dp))
//        Button(onClick = {
//            navController.navigate(Screen.AuthScreen.withArgs("arg"))
//        }, modifier = Modifier.align(Alignment.End)) {
//
//        }
//    }
//}
//
