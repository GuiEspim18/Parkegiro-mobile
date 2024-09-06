package com.example.parkegiro.ui.components.menus

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.parkegiro.ui.theme.Gray
import com.example.parkegiro.ui.theme.MainBlue

@Composable
fun NavMenu() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Gray)
            .height(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        IconButton(
            modifier = Modifier
                .height(45.dp)
                .width(45.dp),
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = Color.Transparent
            ),
            onClick = { /*TODO*/ }
        ) {
            Icon(
                imageVector = Icons.Rounded.Home,
                contentDescription = "Home icon",
                tint = MainBlue,
                modifier = Modifier.size(35.dp)
            )
        }
    }
}