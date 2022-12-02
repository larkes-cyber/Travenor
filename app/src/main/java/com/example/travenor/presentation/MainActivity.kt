package com.example.travenor.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarToday
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.travenor.presentation.navigation.BottomNavBar
import com.example.travenor.presentation.navigation.BottomNavItem
import com.example.travenor.presentation.theme.TravenorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravenorTheme {
                val navController = rememberNavController()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomNavBar(
                            items = listOf(
                                BottomNavItem(
                                    icon = Icons.Default.Home,
                                    name = "Home",
                                    route = "home"
                                ),
                                BottomNavItem(
                                    icon = Icons.Default.CalendarToday,
                                    name = "Calendar",
                                    route = "calendar"
                                ),
                                BottomNavItem(
                                    icon = Icons.Default.Chat,
                                    name = "Messages",
                                    route = "messages"
                                ),
                                BottomNavItem(
                                    icon = Icons.Default.Person,
                                    name = "Profile",
                                    route = "profile"
                                )
                            ),
                            navController = navController,
                            onClick = {
                                navController.navigate(it.route)
                            }
                        )
                    }
                ) {
                    Navigation()
                }
//                Surface(

//                ) {

//                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TravenorTheme {
        Greeting("Android")
    }
}