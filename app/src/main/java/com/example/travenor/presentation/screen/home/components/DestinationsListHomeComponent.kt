package com.example.travenor.presentation.screen.home.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Bookmark
import androidx.compose.material.icons.outlined.MyLocation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.ActivityNavigator
import com.example.travenor.domain.model.Destination
import com.example.travenor.presentation.theme.NavColorMainPart
import com.example.travenor.presentation.theme.OpacityColor
import com.example.travenor.presentation.theme.StarColor
import com.example.travenor.presentation.theme.SubtitleColor


@Composable
fun DestinationsListHomeComponent(list:List<Destination>){
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ){
        itemsIndexed(list){index,item ->
            DestinationHomeItem(item)
        }
    }
}


@Composable
fun DestinationHomeItem(destination: Destination){
    Card(modifier = Modifier
        .width(268.dp),
        shape = RoundedCornerShape(24.dp),
        elevation = 5.dp
    ) {
        Column(Modifier.padding(14.dp)) {
            
            Card(Modifier
                .width(240.dp)
                .height(286.dp),
                shape = RoundedCornerShape(20.dp)
            ) {

                Box(Modifier.fillMaxSize()) {
                    Image(painterResource(id = destination.image),
                        contentDescription = "",
                        modifier = Modifier.fillMaxSize())
                    Row(
                        Modifier
                            .padding(top = 14.dp)
                            .padding(end = 14.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        Card(Modifier
                            .width(34.dp)
                            .height(34.dp),
                            shape = RoundedCornerShape(360.dp),
                            backgroundColor = NavColorMainPart,
                            border = BorderStroke(width = 0.dp, color = OpacityColor)
                        ) {
                            Box(
                                Modifier
                                    .fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.BookmarkBorder,
                                    contentDescription = "",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .width(18.dp)
                                        .height(18.dp)
                                )
                            }
                        }
                    }
                }
            }
            
            Spacer(modifier = Modifier.height(14.dp))
            

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TitleHomeComponent(title = destination.title, size = 18)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Star,
                        contentDescription = "",
                        tint = StarColor,
                        modifier = Modifier
                            .width(14.dp)
                            .height(13.dp)
                    )
                    Spacer(modifier = Modifier.width(3.dp))
                    TitleHomeComponent(title = destination.grade.toString(), size = 15)
                }
            }
        
            Spacer(modifier = Modifier.height(8.dp))
        
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = Icons.Outlined.MyLocation,
                    contentDescription = "",
                    modifier = Modifier
                        .height(16.dp)
                        .width(16.dp),
                    tint = SubtitleColor
                )
                Spacer(modifier = Modifier.width(4.dp))
                SubTitleHomeComponent(title = destination.location, size = 14)
            }
            
        }
    }
}
