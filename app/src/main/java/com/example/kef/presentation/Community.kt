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

    Scaffold(
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .background(
                    Brush.verticalGradient(
                        listOf(
                            Color(0xFF704409), Color.Black
                        )
                    )
                )
                .padding(horizontal = horizontalPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Ambitious person aren't you?", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.White)
            Spacer(modifier = Modifier.height(24.dp))


            Card(modifier=Modifier, backgroundColor = Color(0xFF814F0E), elevation = 4.dp, contentColor = Color.Black) {

                Row(
                    Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                     //   .background(Color(0xFF52340D))
                    ,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.new_logo),
                        contentDescription = "background",
                        modifier = Modifier
                            .size(150.dp),
                        contentScale = ContentScale.Fit
                    )
                    Column(
                        Modifier
                            .padding(horizontal = 4.dp)
                            .weight(1f)
                    ) {
                        Text(text = "KEF Alumni", color = Color.Yellow)
                        Text(text = "join us today", fontSize = 12.sp, color = Color.White)
                    }
                    IconButton(onClick = {}, modifier = Modifier.align(Alignment.Top)) {
                        Icon(imageVector = Icons.Default.MoreVert, contentDescription = "More")
                    }
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Events near you!", fontWeight = FontWeight.SemiBold, fontSize = 16.sp, color = Color.White)
            Spacer(modifier = Modifier.height(24.dp))
            Row(Modifier.fillMaxWidth()) {
                BigButton(
                    icon = Icons.Default.Home,
                    iconTint = Color.Yellow,
                    title = "Open Day",
                    subtitle = "Give back to the community   ",
                    reminder = "Every Day",
                    modifier = Modifier
                        .weight(1f)
                        .clickable { }
                )
                Spacer(modifier = Modifier.width(8.dp))
                BigButton(
                    icon = Icons.Default.Favorite,
                    iconTint = Color.Yellow,
                    title = "Rotarant Voices",
                    subtitle = "Because your are greatfull",
                    reminder = "Every Day",
                    modifier = Modifier
                        .weight(1f)
                        .clickable { }
                        .background(Color(0xFF52340D))
                )
            }
            Spacer(modifier = Modifier.height(32.dp))
            Text(text = "What we do", fontWeight = FontWeight.SemiBold, fontSize = 24.sp, color = Color.White, textAlign = TextAlign.Center)
            Text(text = "Video,press,awards", fontWeight = FontWeight.SemiBold, fontSize = 16.sp, color = Color.White)
            Spacer(modifier = Modifier.height(16.dp))
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
    Card(backgroundColor =  Color(0xFF814F0E), elevation = 0.dp, modifier = modifier, contentColor = Color.White) {
        Column(Modifier.padding(16.dp)) {
            Icon(imageVector = icon, contentDescription = "Icon", tint = iconTint, modifier = Modifier.size(52.dp))
            Text(text = title, fontWeight = FontWeight.SemiBold, fontSize = 18.sp, color = Color.White)
            Text(text = subtitle, fontWeight = FontWeight.Medium, fontSize = 12.sp)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = reminder, fontWeight = FontWeight.SemiBold, fontSize = 10.sp, color = Color(0xFFFFEA00))
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
    Card(modifier, backgroundColor = Color(0xFF814F0E), elevation = 4.dp, contentColor = Color.Black) {
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
                tint = Yellow,
                modifier = Modifier
                    .fillMaxHeight()
                    .aspectRatio(1f)
                    .background(Color.Transparent
                        , RoundedCornerShape(8.dp))
                    .padding(8.dp)
            )
            Column(
                Modifier
                    .padding(horizontal = 4.dp)
                    .weight(1f)
            ) {
                Text(text = title, color = White)
                Text(text = subtitle, fontSize = 12.sp, color = Color.White)
            }
            IconButton(onClick = {}, modifier = Modifier.align(Alignment.Top)) {
                Icon(tint = Yellow,imageVector = Icons.Default.MoreVert, contentDescription = "More")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    Community()
}
























