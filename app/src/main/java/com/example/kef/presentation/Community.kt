package com.example.kef.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp
import com.example.kef.R
import com.example.kef.other.Blue1
import com.example.kef.other.Blue2
import com.example.kef.other.lue2


@Composable
fun Community() {
    val horizontalPadding = 16.dp
    val lazyListState = rememberLazyListState()
    Scaffold(
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .background(
                    Brush.verticalGradient(
                        listOf(
                           Color.Black,Color.DarkGray
                        )
                    )
                )
                .padding(horizontal = horizontalPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
           Spacer(modifier = Modifier.height(18.dp))
//            Text(text = "Ambitious person aren't you?", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.White)
//            Spacer(modifier = Modifier.height(24.dp))

                subss()


//            Card(modifier=Modifier, backgroundColor = Color.Gray, elevation = 4.dp, contentColor = Color.Black) {
//
//                Row(
//                    Modifier
//                        .padding(16.dp)
//                        .fillMaxWidth()
//                        .background(Color.Gray)
//                    ,
//                    verticalAlignment = Alignment.CenterVertically
//                ) {
//                    Image(
//                        painter = painterResource(id = R.drawable.new_logo),
//                        contentDescription = "background",
//                        modifier = Modifier
//                            .size(150.dp),
//                        contentScale = ContentScale.Fit
//                    )
//                    Column(
//                        Modifier
//                            .padding(horizontal = 4.dp)
//                            .weight(1f)
//                    ) {
//                        Text(text = "KEF Alumni", color = Color.White)
//                        Text(text = "join us today", fontSize = 12.sp, color = Color.White)
//                    }
//                    IconButton(onClick = {}, modifier = Modifier.align(Alignment.Top)) {
//                        Icon(imageVector = Icons.Default.MoreVert, contentDescription = "More", tint = Yellow)
//                    }
//                }
//            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Events near you!",
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp, color = Color.White
            )
            Spacer(modifier = Modifier.height(14.dp))
            LazyRow(state = lazyListState, contentPadding = PaddingValues(bottom = 25.dp)) {
                Modifier.background(Color.Black)

                item {

                    BigButton(
                        icon = Icons.Default.GraphicEq,
                        iconTint = Color(0xFFFFC400),
                        title = "Open Day",
                        subtitle = "Give back to the community   ",
                        reminder = "Every Day",
                        modifier = Modifier
                            .weight(1f)
                            .clickable { }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
                item {

                    BigButton(
                        icon = Icons.Default.Face,
                        iconTint = Color(0xFFFFC400),
                        title = "LitWorld's Program",
                        subtitle = "Give back to the community   ",
                        reminder = "Every Day",
                        modifier = Modifier
                            .weight(1f)
                            .clickable { }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
                item {

                    BigButton(
                        icon = Icons.Default.Backup,
                        iconTint = Color(0xFFFFC400),
                        title = "Global Education Campain",
                        subtitle = "Join us",
                        reminder = "13 Feb",
                        modifier = Modifier
                            .weight(1f)
                            .clickable { }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
                item {

                    BigButton(
                        icon = Icons.Default.Dining,
                        iconTint = Color(0xFFFFC400),
                        title = "Bridge To Employment",
                        subtitle = "Give back to the community   ",
                        reminder = "Every Day",
                        modifier = Modifier
                            .weight(1f)
                            .clickable { }
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }

//            Spacer(modifier = Modifier.height(10.dp))
//            Text(text = "What we do", fontWeight = FontWeight.SemiBold, fontSize = 24.sp, color = White, textAlign = TextAlign.Center)
//            Text(text = "Video,press,awards", fontWeight = FontWeight.SemiBold, fontSize = 16.sp, color = White)
//            Spacer(modifier = Modifier.height(16.dp))
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                TaskItem(
                    icon = Icons.Outlined.AccountBox,
                    title = "KEF Blog",
                    subtitle = "Complete programming course",
                    modifier = Modifier.clickable { })
                TaskItem(
                    icon = Icons.Outlined.PlayArrow,
                    title = "Media and press",
                    subtitle = "Create new YouTube tutorial",
                    modifier = Modifier.clickable { })
                TaskItem(
                    icon = Icons.Outlined.DateRange,
                    title = "Our Process",
                    subtitle = "Watch CodingArk new videos",
                    modifier = Modifier.clickable { })
            }
            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}


@Composable
fun BigButton(
    icon: ImageVector,
    iconTint: Color,
    title: String,
    subtitle: String,
    reminder: String,
    modifier: Modifier = Modifier
) {
    Card(backgroundColor =  Color.Gray,
        shape = RoundedCornerShape(8.dp),
        elevation = 10.dp, modifier = modifier,
        contentColor = Color.White) {
        Column(Modifier.padding(15.dp)) {
            Icon(imageVector = icon, contentDescription = "Icon", tint = iconTint, modifier = Modifier.size(70.dp))
            Text(text = title, fontWeight = FontWeight.SemiBold, fontSize = 18.sp, color = Color.White)
            Text(text = subtitle, fontWeight = FontWeight.Medium, fontSize = 12.sp)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = reminder, fontWeight = FontWeight.SemiBold, fontSize = 10.sp, color = Color.White)
     Row(horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.Bottom, modifier = Modifier.padding(start = 80.dp)) {
         IconButton(onClick = {}, modifier = Modifier
             .padding(end = 5.dp)
             .size(20.dp).align(Alignment.Bottom)) {
             Icon(tint = Color(0xFFFFC400),imageVector = Icons.Default.Share, contentDescription = "More")
         }
         IconButton(onClick = {}, modifier = Modifier
             .size(20.dp)
             .align(Alignment.Bottom)) {
             Icon(tint = Color(0xFFFFC400),imageVector = Icons.Default.StarOutline, contentDescription = "More")
         }
     }
        }
    }
}

@Composable
fun TaskItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier
) {
    Card(modifier, backgroundColor = Color.Gray, elevation = 4.dp, contentColor = Color.Black) {
        Row(
            Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .height(IntrinsicSize.Min),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Icon",
                tint = Color(0xFFFFC400),
                modifier = Modifier
                    .fillMaxHeight()
                    .aspectRatio(1f)
                    .background(
                        Color.Transparent, RoundedCornerShape(8.dp)
                    )
                    .padding(8.dp)
            )
            Column(
                Modifier
                    .padding(horizontal = 4.dp)
                    .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = title,
                    color = White
                )

            }
            IconButton(onClick = {}, modifier = Modifier.align(Alignment.Top)) {
                Icon(tint = Color(0xFFFFC400),imageVector = Icons.Default.MoreVert, contentDescription = "More")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    Community()
}
























