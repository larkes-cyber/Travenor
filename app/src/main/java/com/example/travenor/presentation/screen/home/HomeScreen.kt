package com.example.travenor.presentation.screen.home

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travenor.domain.model.Destination
import com.example.travenor.presentation.screen.global_components.HighLightRedirectComponent
import com.example.travenor.presentation.screen.home.components.*
import com.example.travenor.R

val data = arrayListOf<Destination>(
    Destination(
        title = "Darma Reservoir",
        image = R.drawable.first_location,
        location = "Darma, Kuningan",
        grade = 4.9
    ),
    Destination(
        title = "Darma Reservoir",
        image = R.drawable.second_location,
        location = "Darma, Kuningan",
        grade = 4.9
    ),
    Destination(
        title = "Darma Reservoir",
        image = R.drawable.first_location,
        location = "Darma, Kuningan",
        grade = 4.9
    ),
    Destination(
        title = "Darma Reservoir",
        image = R.drawable.second_location,
        location = "Darma, Kuningan",
        grade = 4.9
    )
)

@Composable
fun HomeScreen(navController: NavController){

    Column(
        Modifier
            .fillMaxSize()
            .padding(top = 20.dp)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            ProfileNavHomeComponent()
            NotificationComponent()
        }
        Spacer(modifier = Modifier.height(24.dp))
        Box(modifier = Modifier
            .width(300.dp)
            .padding(horizontal = 10.dp)){
            PromoHomeComponent("Explore the Beautiful world!")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TitleHomeComponent(title = "Best Destination", size = 20)
            HighLightRedirectComponent(text = "View all", route = "home", navController = navController)
        }
        Spacer(modifier = Modifier.height(16.dp))
        DestinationsListHomeComponent(data)
    }

}