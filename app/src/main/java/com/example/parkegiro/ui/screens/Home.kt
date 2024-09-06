package com.example.parkegiro.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.parkegiro.ui.components.headers.Header
import com.example.parkegiro.ui.components.menus.NavMenu
import com.example.parkegiro.ui.theme.White

@Composable
fun Home() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White)
    ) {
        Header()
        Column(
            modifier = Modifier.weight(1f)
        ) {

        }
        NavMenu()
    }
}