package com.example.travenor.presentation.navigation

sealed class Screen(val route:String){
    object SplashScreen: Screen("splash_screen")
    object TrailerScreen: Screen("trailer_screen")
    object AuthScreen: Screen("auth_screen")
    object RegScreen: Screen("reg_screen")
    object ForgotPassword: Screen("forgot_password")

    fun withArgs(vararg args: String):String{
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }

}

