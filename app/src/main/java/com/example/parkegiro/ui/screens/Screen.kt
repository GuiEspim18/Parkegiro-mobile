package com.example.parkegiro.ui.screens

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.parkegiro.ui.components.headers.Header
import com.example.parkegiro.ui.components.menus.NavMenu
import com.example.parkegiro.ui.theme.White

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Screen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White)
    ) {
        Header(navController)
        Column(modifier = Modifier.weight(1f)) {
            NavHost(
                navController = navController,
                startDestination = "home",
            ) {
                composable("home") {
                    Home()
                }
                composable("parked-cars") {
                    ParkingLot()
                }
                composable("revenue") {
                    Revenue()
                }
                composable("employees") {
                    Employees()
                }
                composable("configuration") {
                    Configuration()
                }
                composable("profile") {
                    Profile()
                }
            }
        }
        NavMenu(navController)
    }
}