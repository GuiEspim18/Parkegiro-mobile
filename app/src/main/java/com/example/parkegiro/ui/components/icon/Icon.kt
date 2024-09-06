package com.example.parkegiro.ui.components.icon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.parkegiro.ui.theme.Gray
import com.example.parkegiro.ui.theme.MainBlue

@Composable
fun Icon(icon: Int, color: Color = Gray, description: String = "", size: Dp = 24.dp) {
    Image(
        painter = painterResource(id = icon),
        contentDescription = description,
        colorFilter = ColorFilter.tint(color),
        modifier = Modifier.size(size)
    )
}