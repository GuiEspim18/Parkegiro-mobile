package com.example.parkegiro.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.parkegiro.R
import com.example.parkegiro.ui.components.cards.DoubleTextCard
import com.example.parkegiro.ui.components.contentHolder.ScrollContentHolder
import com.example.parkegiro.ui.theme.MainBlue
import com.example.parkegiro.ui.theme.White

@Composable
fun Revenue() {
    Column {
        ScrollContentHolder(
            title = "Faturamento",
            icon = R.drawable.money,
            divider = false
        ) {
            Box(modifier = Modifier.padding(top = 10.dp, start = 15.dp, end = 15.dp)) {
                DoubleTextCard(
                    firstText = "GBR-9F90",
                    secondText = "Entrada: 08:00 - Saída: 18:00",
                    color = MainBlue,
                    textColor = White
                )
            }
        }
    }
}