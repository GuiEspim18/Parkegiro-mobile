package com.example.parkegiro.ui.components.userInformation

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.parkegiro.ui.theme.DarkGray

@Composable
fun UserPhoto(size: Dp = 40.dp) {
    Box(
        modifier = Modifier
            .height(size)
            .width(size)
            .background(color = DarkGray, shape = RoundedCornerShape(size))
    )
}