package com.example.kef.presentation

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.example.kef.R
import com.example.kef.other.*
import com.example.kef.ui.theme.two
import com.example.kef.utils.elevation
import com.example.kef.utils.onBoardItem
import com.google.accompanist.pager.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.yield

@ExperimentalPagerApi
@Composable
fun Subscribe() {
    val pagerState = rememberPagerState(
        pageCount = natural.size,
        initialOffscreenLimit = 2
    )

    LaunchedEffect(Unit) {
        while (true) {
            yield()
            delay(10000)
            pagerState.animateScrollToPage(
                page = (pagerState.currentPage + 1) % (pagerState.pageCount),
                animationSpec = tween(800)
            )
        }
    }
    Column(
        modifier = Modifier
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color.Black, Color.DarkGray
                    )
                )
            )
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val lazyListState = rememberLazyListState()


        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .weight(1f)
        ) { page ->

                val natural = natural[page]
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .align(Alignment.Center)
                ) {
                    Image(
                        painter = painterResource(
                            id = when (page) {
                                1 -> R.drawable.imgg
                                2 -> R.drawable.img_1
                                3 -> R.drawable.img_5
                                4 -> R.drawable.img_6
                                else -> R.drawable.biro
                            }
                        ),
                        contentDescription = "Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(300.dp)
                            .fillMaxWidth()
                    )
        Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = natural.title,
                        color =  Color.White,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,

                        style = TextStyle(
                            fontFamily = FontFamily.SansSerif,
                            textAlign = TextAlign.Center
                        ),

                        modifier = Modifier.padding(5.dp)
                    )


                }



        }

        PagerIndicator(onBoardItem.size, pagerState.currentPage)
        Card(
            elevation = 25.dp,
            shape = RoundedCornerShape(26.dp) ,
            modifier = Modifier
            .padding(15.dp)
                .height(50.dp)
            .fillMaxWidth(),) {
            OutlinedButton(

                onClick = {},
                colors = ButtonDefaults.outlinedButtonColors(
                    backgroundColor = Color.White
                )
            ) {
                Text(
                    text = "Give Monthly",
                    color = Color.DarkGray,
                    fontWeight = FontWeight.Bold,
                    style = TextStyle(
                        fontFamily = FontFamily.SansSerif,
                        textAlign = TextAlign.Center
                    )
                )
        }


        }
        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.height(70.dp))
    }
}





@Composable
fun PagerIndicator(size: Int, currentPage: Int) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(bottom = 40.dp)
    ) {
        repeat(size) {
            IndicateIcon(
                isSelected = it == currentPage
            )
        }
    }
}

@Composable
fun IndicateIcon(isSelected: Boolean) {
    val width = animateDpAsState(
        targetValue = if (isSelected) 14.dp else 10.dp
    )
    val height = animateDpAsState(
        targetValue = if (isSelected) 12.dp else 10.dp
    )

    Box(
        modifier = Modifier
            .padding(3.dp)
            .height(height.value)
            .width(width.value)
            .clip(CircleShape)
            .background(
                if (isSelected) {
                    Color.LightGray
                } else {
                    Color.Gray.copy(alpha = 0.5f)
                }
            )
    )
}





