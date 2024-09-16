package com.example.parkegiro.ui.components.entrances

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.parkegiro.R
import com.example.parkegiro.ui.components.buttons.IconButton
import com.example.parkegiro.ui.components.cards.DoubleTextCard
import com.example.parkegiro.ui.components.content.Content
import com.example.parkegiro.ui.theme.Orange
import com.example.parkegiro.ui.theme.Red
import com.example.parkegiro.ui.theme.White

@Composable
fun Entrances() {
    Content {

        var i: Int = 0

        while (i < 6) {
            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "GBR-9F90",
                secondText = "Entrada: 08:30",
                cardColor = White,
                actions = listOf(
                    {
                        IconButton(icon = R.drawable.edit, iconSize = 19.dp, iconColor = Orange, onClick = { /*TODO*/ })
                    },
                    {
                        IconButton(icon = R.drawable.delete, iconSize = 19.dp, iconColor = Red, onClick = { /*TODO*/ })
                    }
                )
            )
            i++
        }

        Spacer(modifier = Modifier.height(20.dp))

    }
}