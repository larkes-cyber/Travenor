package com.example.travenor.presentation.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.travenor.presentation.theme.LightPrimaryBlue
import com.example.travenor.presentation.theme.SubtitleColor
import com.example.travenor.presentation.theme.sfuidisplay

@Composable
fun BottomNavBar(
    items:List<BottomNavItem>,
    navController: NavController,
    onClick:(BottomNavItem) -> Unit
){
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomNavigation(
        modifier = Modifier,
        backgroundColor = Color.White,
        elevation = 5.dp
    ) {
        items.forEach { item ->
            val selected = item.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
                selected = selected,
                onClick = { onClick(item)},
                selectedContentColor = LightPrimaryBlue,
                unselectedContentColor = SubtitleColor,
                icon = {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(imageVector = item.icon, contentDescription = "")
                        if(selected){
                            Text(
                                text = item.name,
                                fontSize = 12.sp,
                                color = LightPrimaryBlue,
                                fontFamily = sfuidisplay,
                                fontWeight = FontWeight.Normal
                            )
                        }
                    }
                }
            )
        }
    }
}