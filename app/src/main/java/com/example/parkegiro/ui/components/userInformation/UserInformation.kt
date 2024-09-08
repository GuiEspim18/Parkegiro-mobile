package com.example.parkegiro.ui.components.userInformation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.parkegiro.R
import com.example.parkegiro.ui.components.buttons.IconButton
import com.example.parkegiro.ui.theme.DarkBlue
import com.example.parkegiro.ui.theme.SecondaryBlue

@Composable
fun UserInformation(userName: String) {
    Row(
        modifier = Modifier
            .fillMaxHeight(),
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