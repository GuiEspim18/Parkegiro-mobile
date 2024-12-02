package com.example.parkegiro.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.parkegiro.R
import com.example.parkegiro.ui.components.buttons.IconButton
import com.example.parkegiro.ui.components.cards.DoubleTextCard
import com.example.parkegiro.ui.components.contentHolder.ScrollContentHolder
import com.example.parkegiro.ui.theme.Orange
import com.example.parkegiro.ui.theme.Red
import com.example.parkegiro.ui.theme.White

@Composable
fun Employees() {
    ScrollContentHolder(title = "Funcionários", icon = R.drawable.people, divider = false) {
        Box(modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 10.dp)) {
            DoubleTextCard(
                firstText = "Guilherme Monteiro Espim",
                secondText = "Ativo",
                color = White,
                actions = listOf(
                    {
                        IconButton(icon = R.drawable.edit, iconSize = 19.dp, iconColor = Orange, onClick = { /*TODO*/ })
                    },
                    {
                        IconButton(icon = R.drawable.delete, iconSize = 19.dp, iconColor = Red, onClick = { /*TODO*/ })
                    }
                )
            )
        }
    }
}