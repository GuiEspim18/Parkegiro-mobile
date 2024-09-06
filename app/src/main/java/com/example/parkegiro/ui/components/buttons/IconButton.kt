package com.example.parkegiro.ui.components.buttons

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.parkegiro.ui.components.icon.Icon
import com.example.parkegiro.ui.theme.MainBlue

@Composable
fun IconButton(icon: Int, onClick: () -> Unit, iconColor: Color = MainBlue, iconSize: Dp = 24.dp,  modifier: Modifier = Modifier) {
    androidx.compose.material3.IconButton(
        modifier = modifier.then(
            Modifier
                .height(45.dp)
                .width(45.dp),
        ),
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = Color.Transparent
        ),
        onClick = onClick
    ) {
        Icon(icon = icon, color = iconColor, size = iconSize)
    }
}