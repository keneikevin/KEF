package com.example.kef.presentation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.graphicsLayer
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

@OptIn(ExperimentalFoundationApi::class)
@ExperimentalPagerApi
@Composable
fun HomeScreen(
) {
    val lazyListState = rememberLazyListState()


        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .background(
                    Brush.verticalGradient(
                        listOf(
                            Color.Black, Color.DarkGray
                        )
                    )
                )

        ) {


            LazyColumn(state = lazyListState, contentPadding = PaddingValues(bottom = 25.dp)) {
                item {
                    Introduction()
                }
        item {

        }
                item {
                    Feature(
                        "GIFT A STUDENT TODAY!",
                        "Giving is not just about making a donation, it's about making a difference",
                        painterResource(id = R.drawable.wing),
                        "Donate Now",
                        Brush.horizontalGradient(
                            listOf(
                                Color(0xFF3D5AFE),Color(0xFF00E676)
                            )
                        ),
                        ContentScale.Fit
                    )
                }
                item {
                    Feature(
                        "How to Apply",
                        "Looking for a HighSchool Scholarship in Kenya?",
                        painterResource(id = R.drawable.canvas),
                        "Apply Now",
                        Brush.horizontalGradient(
                            listOf(
                                Color(0xFFFF9100),Color(0xFFFF3D00)
                            )
                        ),
                        ContentScale.Fit
                    )
                }
                item {
                    Feature(
                        "Finfinancials",
                        "contribute to our mission while enjoying some financial benefits",
                        painterResource(id = R.drawable.finfinn),
                        "Gift Now",
                        Brush.horizontalGradient(
                            listOf(
                                Color(0xFF651FFF), Color(0xFFD500F9)
                            )
                        ),
                        ContentScale.Fit
                    )
                }
                item {
                    Feature(
                        "BECOME A KEF AMBASSADOR",
                        "Join the global movement to increase access to education",
                        painterResource(id = R.drawable.ambassadorr),
                        "Join",
                        Brush.verticalGradient(
                            listOf(
                                Color(0xFF95D360), Color(0xFF4CAF50)
                            )
                        ),
                        ContentScale.Fit
                    )
                }
                item {
                    Feature(
                        "GIFT IN SECURITIES",
                        "contribute to our mission while enjoying some financial benefits",
                        painterResource(id = R.drawable.box),
                        "Gift Now",
                            Brush.verticalGradient(
                                listOf(
                                    Color(0xFFFFC400),Color(0xFFC04F2C)
                                )
                            ),
                        ContentScale.Fit
                    )
                }

                item {

                    Spacer(modifier = Modifier.height(50.dp))
                }

            }
        }

}



@Composable
fun Feature(title: String, sub: String, image: Painter, Button: String, horizontalGradient: Brush,contentScale:ContentScale){
    val verticalGradient = Brush.verticalGradient(
        colors = listOf(MaterialTheme.colors.primary, MaterialTheme.colors.primaryVariant),
        startY = 0f,
        endY = 100f
    )
    Card(
        modifier = Modifier
            .padding( 15.dp)
        ,
        shape = RoundedCornerShape(15.dp),
        elevation = 20.dp
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(horizontalGradient),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(painter = image,
                    contentDescription = "profile",
                    contentScale = contentScale,
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(190.dp)
                        //.padding(bottom = 20.dp)
                        .background(Color.Transparent)
                    )
                Box(modifier = Modifier
                    .fillMaxSize()
                ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(20.dp)
           ){


                Text(
                    text = title,
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold,
                    style = TextStyle(
                        fontFamily = FontFamily.Serif,
                        textAlign = TextAlign.Center
                    )
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = sub,
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    style = TextStyle(
                        fontFamily = FontFamily.Serif,
                        textAlign = TextAlign.Center
                    )

                )
                Spacer(modifier = Modifier.height(15.dp))
                Button(onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(25.dp),
                    modifier = Modifier
                        .height(65.dp)
                        .fillMaxWidth()
                        .padding(start = 30.dp, end =30.dp, bottom = 20.dp)
                    ,
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White,
                                contentColor = Color.LightGray,
                    )
                    ) {
                    Text(
                        text = Button,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = Color.Black
                        )

                }}
                Spacer(modifier = Modifier.height(30.dp))
            }}
    }
}

@Composable
fun Introduction(){
    BoxWithConstraints(modifier = Modifier.fillMaxSize()){

    Box(modifier = Modifier
        .fillMaxSize()
        .background(
            Brush.verticalGradient(
                colors = listOf(
                    Color.White,
                    Color.White
                ),
                startY = 300f
            )
        )
    ) {
        Image(
            painter = painterResource(id = R.drawable.group),
            contentDescription = "background",
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            contentScale = ContentScale.Crop
        )

    }


}

}
