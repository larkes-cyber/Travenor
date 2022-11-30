package com.example.travenor.presentation.screen.trailer

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travenor.R
import com.example.travenor.presentation.navigation.Screen
import com.example.travenor.presentation.screen.trailer.components.*

@Composable
fun TrailerScreen(navController: NavController) {

    var epochState = remember {
        mutableStateOf(1)
    }

    val trailerData = listOf<TrailerModel>(
        TrailerModel(
            image = R.drawable.trailer_first,
            title = "Life is short and the world is wide",
            subtitle = "At Friends tours and travel, we customize reliable and trutworthy educational tours to destinations all over the world",
            buttonText = "Get Started"
        ),
        TrailerModel(
            image = R.drawable.trailer_second,
            title = "It’s a big world out there go explore",
            subtitle = "To get the best of your adventure you just need to leave and go where you like. we are waiting for you",
            buttonText = "Next"
        ),
        TrailerModel(
            image = R.drawable.trailer_third,
            title = "People don’t take trips, trips take people",
            subtitle = "To get the best of your adventure you just need to leave and go where you like. we are waiting for you",
            buttonText = "Next"
        )
    )

    if(epochState.value == 4) {
        navController.navigate(Screen.AuthScreen.route)
        epochState.value = 5
    }
    else if(epochState.value < 4) TrailerComponent(trailerData[epochState.value - 1], epochState)

}

@Composable
fun TrailerComponent(trailerModel: TrailerModel,epochState:MutableState<Int>){
    Column(Modifier.fillMaxSize()) {

        ImageTrailerComponent(trailerModel.image)

        Spacer(Modifier.height(33.dp))
        TitleTrailerComponent(title = trailerModel.title)

        Spacer(Modifier.height(19.dp))
        SubtitleTrailerComponent(subtitle = trailerModel.subtitle)

        Spacer(Modifier.height(24.dp))
        Box(
            Modifier.align(Alignment.CenterHorizontally)
        ){
            NavBarTrailer(epoch = epochState.value)
        }

        Spacer(Modifier.height(38.dp))
        Box(Modifier.padding(horizontal = 20.dp)) {
            ButtonTrailerComponent(trailerModel.buttonText, epochState)
        }
    }
}