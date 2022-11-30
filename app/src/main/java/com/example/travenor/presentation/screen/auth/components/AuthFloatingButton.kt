package com.example.travenor.presentation.screen.auth.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travenor.presentation.theme.InputBoxColor
import com.example.travenor.presentation.theme.TitleColor

@Composable
fun AuthFloatingButton() {
    FloatingActionButton(onClick = {  },
        backgroundColor = InputBoxColor,
        modifier = Modifier.height(44.dp).width(44.dp),
    ) {
        Icon(imageVector = Icons.Filled.ArrowBackIos,
            contentDescription = "",
            tint = TitleColor,
            modifier = Modifier.width(16.dp)
        )

    }
}