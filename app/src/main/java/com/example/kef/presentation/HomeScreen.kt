package com.example.kef.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kef.R
import com.example.kef.other.*
import com.example.kef.utils.AppBar
import com.example.kef.utils.elevation
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun HomeScreen() {
    val lazyListState = rememberLazyListState()

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(Color.White)

        ) {


            LazyColumn(state = lazyListState, contentPadding = PaddingValues(bottom = 25.dp)) {
                item {
                    Introduction()
                }
                item {
                    Feature(
                        "GIFT A STUDENT TODAY!",
                        "Giving is not just about making a donation, it's about making a difference",
                        painterResource(id = R.drawable.img_3),
                        "Donate Now",
                        Brush.horizontalGradient(
                            listOf(
                                Color(0x39FF5722), Color(0xFFFF5722)
                            )
                        )
                    )
                }
                item {
                    Feature(
                        "How to Apply",
                        "Looking for a HighSchool Scholarship in Kenya?",
                        painterResource(id = R.drawable.img_2),
                        "Apply Now",
                        Brush.horizontalGradient(
                            listOf(
                                Color(0xFF58DACE), Color(0xFF009688)
                            )
                        )
                    )
                }
                item {
                    Feature(
                        "Finfinancials",
                        "contribute to our mission while enjoying some financial benefits",
                        painterResource(id = R.drawable.finfin),
                        "Gift Now",
                        Brush.horizontalGradient(
                            listOf(
                                Color(0x39FF5722), Color(0xFFFF3D00)
                            )
                        )
                    )
                }
                item {
                    Feature(
                        "BECOME A KEF AMBASSADOR",
                        "Join the global movement to increase access to education",
                        painterResource(id = R.drawable.ambassadorr),
                        "Join",
                        Brush.horizontalGradient(
                            listOf(
                                Color(0xFF58DACE), Color(0xFF4CAF50)
                            )
                        )
                    )
                }
                item {
                    Feature(
                        "GIFT IN SECURITIES",
                        "contribute to our mission while enjoying some financial benefits",
                        painterResource(id = R.drawable.secure),
                        "Gift Now",
                            Brush.horizontalGradient(
                                listOf(
                                    Color(0x39FF5722), Color(0xFFF44336)
                                )
                            )
                    )
                }

                item {

                    Spacer(modifier = Modifier.height(50.dp))
                }

            }
        }

}

@Composable
fun Feature(title: String, sub: String, image: Painter, Button: String, horizontalGradient: Brush){

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp, top = 15.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 20.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(horizontalGradient),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
            ) {
                Image(painter = image,
                    contentDescription = "profile",
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .padding(bottom = 20.dp)
                        .background(Color.White)
                    )
                Spacer(modifier = Modifier.height(20.dp))
                Box(modifier = Modifier
                    .fillMaxSize()
                ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
           ){


                Text(
                    text = title,
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.Serif,
                        textAlign = TextAlign.Center
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = sub,
                    color = Color.DarkGray,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    style = TextStyle(
                        fontFamily = FontFamily.Serif,
                        textAlign = TextAlign.Center
                    )

                )
                Spacer(modifier = Modifier.height(15.dp))
                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 40.dp, end = 40.dp, bottom = 10.dp)
                    ,
                    colors = ButtonDefaults.buttonColors(

                        backgroundColor = Color(0xFF4CAF50),
                                contentColor = Color.White,
                    )
                    ) {
                    Text(
                        text = Button,
                        color = Color.White
                        )

                }}
                Spacer(modifier = Modifier.height(30.dp))
            }}
    }
}

@Composable
fun Introduction(){
Box(modifier = Modifier.fillMaxSize()){
    Image(
        painter = painterResource(id = R.drawable.group),
        contentDescription = "background",
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
        ,
        contentScale = ContentScale.Crop
    )
    Text(
        modifier=  Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 10.dp)
        ,
        text = buildAnnotatedString {
            val text = stringResource(id = R.string.numbers)

            withStyle(
                style = SpanStyle(
                    color = Color.Yellow,
                    fontSize = 13.sp,
                    fontFamily = FontFamily.Monospace,

                    fontWeight = FontWeight.Bold,
                    //textDecoration = TextDecoration.Underline,

                )
            ) {
                append(text)
            }
            append(" ")
            append(stringResource(id = R.string.students_kept_in_school))

        },
        style = MaterialTheme.typography.body1,
        color =  Color.Green,
        fontSize = 13.sp,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        // textDecoration = TextDecoration.Underline,
    )
}

}

