package com.example.parkegiro.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.parkegiro.R
import com.example.parkegiro.ui.components.contentHolder.ScrollContentHolder
import com.example.parkegiro.ui.components.entrances.Entrances
import com.example.parkegiro.ui.components.exits.Exits
import com.example.parkegiro.ui.components.tabs.Tabs
import com.example.parkegiro.utils.interfaces.Tab

@Preview(showBackground = true)
@Composable
fun ParkingLot() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        ScrollContentHolder(
            title = "Pátio",
            icon = R.drawable.car,
            divider = false,
            modifier = Modifier.fillMaxSize()
        ) {
            Tabs(
                tabs = listOf(
                    Tab(name = "Entradas", content = { Entrances() }),
                    Tab(name = "Saídas", content = { Exits() })
                )
            )

        }
    }
}