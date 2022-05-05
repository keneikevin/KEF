package com.example.kef.presentation
import androidx.annotation.DrawableRes
import com.example.kef.R

data class Page(val title: String , val description : String,
                @DrawableRes val image: Int)



data class IntroModel(
    val title:String,
    val imagUrl:String
)

val natural = listOf(
    IntroModel(
        "High School is not free in Kenya",
        "High School is not free in Kenya"
    ),
    IntroModel(
        "We envision a self-reliant Kenya through education",
        " Sample 1",
    ),

    IntroModel(
        "KEF provides HighSchool scholarships",
        "Sample 1",
    )
)