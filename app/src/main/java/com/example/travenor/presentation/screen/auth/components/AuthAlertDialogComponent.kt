package com.example.travenor.presentation.screen.auth.components

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.travenor.R


@Composable
fun AuthAlertDialogComponent(state:MutableState<Boolean>, navController: NavController, route:String) {
    if(state.value){
        AlertDialog(
            onDismissRequest = {
                navController.navigate(route)
                state.value = false
                               },
            title = {
                Column(Modifier.fillMaxWidth()) {
                    Image(
                        painterResource(id = R.drawable.check_email),
                        contentDescription = "",
                        modifier = Modifier
                            .height(44.dp)
                            .width(44.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                }

            },
            text = {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    AuthTitleComponent(title = "Check your email", size = 18)
                    AuthSubtitleComponent(subtitle = "We have send password recovery instruction to your email", size = 16)

                }
            },
            buttons = {},
            shape = RoundedCornerShape(13.dp),
            modifier = Modifier.height(200.dp),
        )
    }
}

