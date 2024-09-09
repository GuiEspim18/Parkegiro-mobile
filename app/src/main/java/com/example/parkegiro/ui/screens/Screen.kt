package com.example.parkegiro.ui.screens

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.parkegiro.ui.components.headers.Header
import com.example.parkegiro.ui.components.menus.NavMenu
import com.example.parkegiro.ui.theme.White
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.animation.composable

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Screen() {
    val navController = rememberAnimatedNavController()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White)
    ) {
//        Header()
        AnimatedNavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.weight(1f)
        ) {
            composable(route = "home") {
                Home()
            }
        }
//        NavMenu()
    }
}