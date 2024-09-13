package com.example.parkegiro.ui.components.menus

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.parkegiro.R
import com.example.parkegiro.ui.components.buttons.IconButton
import com.example.parkegiro.ui.theme.MainBlue
import com.example.parkegiro.ui.theme.White

@Composable
fun NavMenu(navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(MainBlue)
            .height(60.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            icon = R.drawable.home,
            onClick = { navController.navigate("home") },
            modifier = Modifier.padding(horizontal = 15.dp),
            iconColor = White,
            iconSize = 28.dp
        )
        IconButton(
            icon = R.drawable.car,
            onClick = { navController.navigate("parked-cars") },
            modifier = Modifier.padding(horizontal = 15.dp),
            iconColor = White,
            iconSize = 28.dp
        )
        IconButton(
            icon = R.drawable.money,
            onClick = { navController.navigate("revenue") },
            modifier = Modifier.padding(horizontal = 15.dp),
            iconColor = White,
            iconSize = 28.dp
        )
        IconButton(
            icon = R.drawable.people,
            onClick = { navController.navigate("employees") },
            modifier = Modifier.padding(horizontal = 15.dp),
            iconColor = White,
            iconSize = 28.dp
        )
        IconButton(
            icon = R.drawable.configurations,
            onClick = { navController.navigate("configuration") },
            modifier = Modifier.padding(horizontal = 15.dp),
            iconColor = White,
            iconSize = 28.dp
        )
    }
}