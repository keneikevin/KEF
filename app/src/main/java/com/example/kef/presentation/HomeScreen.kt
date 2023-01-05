package com.example.kef.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Backup
import androidx.compose.material.icons.filled.Dining
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.GraphicEq
import androidx.compose.material.icons.outlined.SpeakerGroup
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
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

@Composable
fun HomeScree(modifier: Modifier= Modifier.background(Color.Black)){
    val lazyListState = rememberLazyListState()
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color.DarkGray, Color.Black
                    )
                )
            )

    ) {
        LazyColumn(state = lazyListState, contentPadding = PaddingValues(bottom = 25.dp)) {
            modifier.background(Color.Black)

//            item {
//                Introduction()
//            }

            item {
                Row() {
                    Big(
                        painterResource(id = R.drawable.canvas),
                        title = "",
                        subtitle = "How to Apply",
                        reminder = "Looking for a HighSchool Scholarship in Kenya?",
                        horizontalGradient =   Brush.horizontalGradient(
                            listOf(
                                Color(0xFF00E676),Color(0xFF3D5AFE)
                            )
                        ),
                        modifier = Modifier
                            .weight(1f)
                            .clickable { }
                    )
                    Big(
                        painterResource(id = R.drawable.box),
                        title = "",
                        subtitle = "Gift a Student",
                        horizontalGradient = Brush.horizontalGradient(
                            listOf(
                                Color(0xFFFFC400),Color(0xFFC04F2C)
                            )
                        ),
                        reminder = "Giving is not just about making a donation, it's about making a difference.",
                        modifier = Modifier
                            .weight(1f)
                            .clickable { }
                    )
Spacer(modifier = Modifier.width(10.dp))
                }
            }

//            item {
//                Row() {
//                    Big(
//                        painterResource(id = R.drawable.wing),
//                        title = "KEF ",
//                        subtitle = "",
//                        reminder = "Our Process",
//                        horizontalGradient = Brush.verticalGradient(
//                            listOf(
//                                Color(0xFFFFC400),Color(0xFFC04F2C)
//                            )
//                        ),
//                        modifier = Modifier
//                            .weight(1f)
//                            .clickable { }
//                    )
//
//
//                    Big(
//                        painterResource(id = R.drawable.finfinn),
//                        title = "",
//                        subtitle = "Finfinancial",
//                        reminder = "How is my donation being used?",
//                        horizontalGradient = Brush.verticalGradient(
//                            listOf(
//                                 Color(0xFFD500F9),Color(0xFF651FFF)
//                            )
//                        ),
//                        modifier = Modifier
//                            .weight(1f)
//                            .clickable { }
//                    )
//
//                }
//            }
            item {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                Text(
                    modifier = Modifier
                        .align(CenterHorizontally)
                        .padding(start = 50.dp),
                    text = "Events near you!",
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center,
                    fontSize = 16.sp, color = Color.White
                )
            }}
            item {
                eventss()
            }

            item {
                subs()
            }

        }
    }
}


@Composable
fun Big(
    image: Painter,
    title: String,
    horizontalGradient: Brush,
    subtitle: String,
    reminder: String,
    modifier: Modifier = Modifier
) {
    Card( elevation = 10.dp, modifier = modifier
        .padding(top = 25.dp, bottom = 15.dp, start = 10.dp)
        .height(180.dp), contentColor = Color.White, shape = RoundedCornerShape(7.dp)) {
        Column(
            Modifier
                .background(horizontalGradient),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = image,
                contentScale = ContentScale.Fit,
                contentDescription = "profile",
                modifier = Modifier
                    .size(100.dp)
                    .align(CenterHorizontally))
           Text(text = reminder, fontWeight = FontWeight.Bold, fontSize = 12.sp, color = Color.White, textAlign = TextAlign.Center, modifier = modifier.padding(5.dp))

            Spacer(modifier = Modifier.height(5.dp))
                Text(text = subtitle, fontWeight = FontWeight.ExtraBold, fontSize = 10.sp,color = Color.Black ,textAlign = TextAlign.Center)
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Composable
fun subs(modifier: Modifier= Modifier){
    Card(
        shape = RoundedCornerShape(11.dp),
        elevation = 10.dp, modifier = modifier
            .height(450.dp)
            .padding(20.dp)
    ) {
    Box(
    modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray)
    ) {

        Image(
            painter = painterResource(id = R.drawable.invite),
            contentDescription = "background",
            modifier = modifier
                .fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
        Text(
            text = "Spread the word!",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            color =  Color.Black,
            textAlign = TextAlign.Center,
            modifier = modifier
                .align(TopCenter)
                .padding(top = 5.dp)
        )

        OutlinedButton(
            modifier= modifier
                .align(Center)
                .padding(bottom = 50.dp),
            onClick = {},
            colors = ButtonDefaults.outlinedButtonColors(
                backgroundColor = Color.White,
            )
        ) {
            Text(
                text = "Invite Friends",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                style = TextStyle(
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Center
                )
            )
        }



            Text(
                modifier = modifier
                    .align(BottomCenter)
                    .padding(start = 30.dp, end = 30.dp, bottom = 20.dp),
                text = "Invite your friends and family let's share and gift student together.",
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp, color = Color.White,
                textAlign = TextAlign.Center)


    }





    }

}

@Composable
fun sponsor(){

    Card(
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .padding(top = 10.dp, bottom = 20.dp, start = 20.dp, end = 20.dp)
            .height(155.dp)
            .fillMaxWidth()) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Color.LightGray)
    ) {
        Image(
            painter = painterResource(id = R.drawable.litworld),
            contentDescription = "background",
            modifier = Modifier
                .padding(top = 5.dp)
                .height(100.dp)
                .background(Color.Transparent),
            contentScale = ContentScale.FillBounds
        )
        OutlinedButton(
            onClick = {},
            colors = ButtonDefaults.outlinedButtonColors(
                backgroundColor = Color.White,
            )
        ) {
            Text(
                text = "Partners",
                color = Color.Black,
                fontWeight = FontWeight.SemiBold,
                style = TextStyle(
                    fontFamily = FontFamily.Monospace,
                    textAlign = TextAlign.Center
                )
            )
        }
    }


    }
}

@Composable
fun subss(modifier: Modifier= Modifier){

    Text(
        textAlign = TextAlign.Center,
        modifier= Modifier
           // .align(Alignment.TopCenter)
            .padding(top=10.dp,bottom=10.dp,start=15.dp,end=10.dp)
        ,
        text = buildAnnotatedString {
            val text = stringResource(id = R.string.numbers)

            withStyle(
                style = SpanStyle(
                    color =  Color(0xFF76FF03),
                    fontSize = 13.sp,
                    fontFamily = FontFamily.Cursive,

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
        color =  Color(0xFFFFC400),
        fontSize = 13.sp,
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.ExtraBold,
        // textDecoration = TextDecoration.Underline,
    )
        Card(
            shape = RoundedCornerShape(10.dp),
            elevation = 50.dp, modifier = modifier
                .padding(bottom =20.dp, top = 5.dp, start = 0.dp, end = 0.dp)
        ) {

            Box(modifier = Modifier
                .fillMaxSize()
                .padding(),
                contentAlignment = TopCenter
            ) {

                Image(
                    painter = painterResource(id = R.drawable.we),
                    contentDescription = "background",
                    modifier = modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Fit
                )

            }

        }
}
@Composable fun eventss(){
    val lazyListState = rememberLazyListState()
    Spacer(modifier = Modifier.height(7.dp))
    LazyRow(state = lazyListState, contentPadding = PaddingValues(bottom = 25.dp, start = 10.dp)) {
        Modifier.background(Color.Black)

        item {
            BigButton(
                icon = Icons.Default.GraphicEq,
                iconTint = Color(0xFFFFC400),
                title = "Open Day",
                subtitle = "Give back to the community   ",
                reminder = "Every Day",
                modifier = Modifier
                 //   .weight(1f)
                    .clickable { }
            )
            Spacer(modifier = Modifier.width(13.dp))
        }
        item {

            BigButton(
                icon = Icons.Default.Face,
                iconTint = Color(0xFFFFC400),
                title = "LitWorld's Program",
                subtitle = "Give back to the community   ",
                reminder = "Every Day",
                modifier = Modifier
                  //  .weight(1f)
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
                  //  .weight(1f)
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
                   // .weight(1f)
                    .clickable { }
            )
            Spacer(modifier = Modifier.width(8.dp))
        }
    }
}
