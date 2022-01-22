package com.example.kef.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kef.R


@Composable
fun AppBar(
    title: String,
    elevation: Dp
) {
    TopAppBar(
        modifier =   Modifier.background(
            Brush.verticalGradient(
                listOf(
                    Color(0xFFE1F0D1), Color(0xFFF44336)
                )
            )
        ),
        title = {
    Column() {

            Text(
                modifier=  Modifier

                ,
                text = buildAnnotatedString {
                    val text = stringResource(id = R.string.numbers)

                    withStyle(
                        style = SpanStyle(
                            color = Color.Green,
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
                color =  Color(0xFF673AB7),
                fontSize = 13.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                // textDecoration = TextDecoration.Underline,
            )
            Text(
                modifier=  Modifier

                ,
                text = buildAnnotatedString {
                    val text = "3712+"

                    withStyle(
                        style = SpanStyle(
                            color = Color.Green,
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
                color =  Color(0xFF673AB7),
                fontSize = 13.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                // textDecoration = TextDecoration.Underline,
            )
            Text(
                modifier=  Modifier

                ,
                text = buildAnnotatedString {
                    val text = stringResource(id = R.string.numbers)

                    withStyle(
                        style = SpanStyle(
                            color = Color.Green,
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
                color =  Color(0xFF673AB7),
                fontSize = 13.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                // textDecoration = TextDecoration.Underline,
            )}
        },
        elevation = elevation,
    )
}

val LazyListState.elevation: Dp
    get() = if (firstVisibleItemIndex == 0) {
        minOf(firstVisibleItemScrollOffset.toFloat().dp, AppBarDefaults.TopAppBarElevation)
    } else {
        AppBarDefaults.TopAppBarElevation
    }




