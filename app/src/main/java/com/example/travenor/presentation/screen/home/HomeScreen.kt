package com.example.travenor.presentation.screen.home

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travenor.presentation.screen.global_components.HighLightRedirectComponent
import com.example.travenor.presentation.screen.home.components.ProfileNavHomeComponent
import com.example.travenor.presentation.screen.home.components.NotificationComponent
import com.example.travenor.presentation.screen.home.components.PromoHomeComponent
import com.example.travenor.presentation.screen.home.components.TitleHomeComponent

@Composable
fun HomeScreen(navController: NavController){

    Column(
        Modifier
            .fillMaxSize()
            .padding(top = 20.dp, start = 20.dp, end = 20.dp)
    ) {
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            ProfileNavHomeComponent()
            NotificationComponent()
        }
        Spacer(modifier = Modifier.height(24.dp))
        Box(modifier = Modifier.width(300.dp)){
            PromoHomeComponent("Explore the Beautiful world!")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TitleHomeComponent(title = "Best Destination", size = 20)
            HighLightRedirectComponent(text = "View all", route = "home", navController = navController)
        }
    }

}