package com.example.travenor.presentation.screen.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.travenor.presentation.theme.InputBoxColor


@Composable
fun NotificationComponent(){
    Card(
        backgroundColor = InputBoxColor,
        shape = RoundedCornerShape(360.dp)
    ) {
        Box(Modifier.padding(10.dp)) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = "",
                modifier = Modifier
                    .height(24.dp)
                    .width(24.dp)
            )
        }
    }
}