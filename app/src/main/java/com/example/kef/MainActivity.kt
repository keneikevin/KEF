package com.example.kef

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kef.presentation.*
import com.example.kef.presentation.Subscribe
import com.example.kef.presentation.navigation.BottomNavItem
import com.example.kef.presentation.navigation.BottomNavigationBar
import com.example.kef.ui.theme.KEFTheme
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    @ExperimentalMaterialApi
    @ExperimentalPagerApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);


        setContent {
            KEFTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                    val navController = rememberNavController()
                    Scaffold(
                        bottomBar = {

                            BottomNavigationBar(
                                items = listOf(
                                    BottomNavItem(
                                        name = "Home",
                                        route = "home",
                                        icon = Icons.Default.Home
                                    ),
                                    BottomNavItem(
                                        name = "Subscription",
                                        route = "subscription",
                                        icon = Icons.Default.Favorite
                                    ),
                                    BottomNavItem(
                                        name = "Community",
                                        route = "community",
                                        icon = Icons.Default.Person
                                    ),
                                ),
                                navController = navController,
                                onItemClick = {
                                    navController.navigate(it.route)
                                })
                        }

                    ) {
                            Navigation(navController = navController)
                    }
                }
            }
        }
    }
}


@ExperimentalPagerApi
@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen()
        }
        composable("subscription") {
            Subscribe()
        }
        composable("community") {
            Community()
        }
    }
}


