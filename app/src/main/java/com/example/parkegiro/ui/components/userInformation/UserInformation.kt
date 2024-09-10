package com.example.parkegiro.ui.components.userInformation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.parkegiro.ui.theme.DarkBlue

@Composable
fun UserInformation(userName: String, onClick: (() -> Unit)? = null) {
    Row(
        modifier = Modifier
            .fillMaxHeight()
            .clickable {
                if (onClick != null) {
                    onClick()
                }
            },
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Olá $userName!",
            modifier = Modifier.padding(end = 15.dp),
            color = DarkBlue
        )
        UserPhoto()
    }
}