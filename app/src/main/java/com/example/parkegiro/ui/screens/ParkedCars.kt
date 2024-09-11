package com.example.parkegiro.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.parkegiro.R
import com.example.parkegiro.ui.components.cards.DoubleTextCard
import com.example.parkegiro.ui.components.contentHolder.ScrollContentHolder

@Composable
fun ParkedCars() {
    Column {
        ScrollContentHolder(title = "Carros Estacionados", icon = R.drawable.car, divider = false) {
            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "Peugeot 308 THP - Branco",
                secondText = "Placa: GBR-9F90  Entrada: 08:30"
            )

            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "Peugeot 308 THP - Branco",
                secondText = "Placa: GBR-9F90  Entrada: 08:30"
            )

            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "Peugeot 308 THP - Branco",
                secondText = "Placa: GBR-9F90  Entrada: 08:30"
            )

            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "Peugeot 308 THP - Branco",
                secondText = "Placa: GBR-9F90  Entrada: 08:30"
            )

            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "Peugeot 308 THP - Branco",
                secondText = "Placa: GBR-9F90  Entrada: 08:30"
            )

            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "Peugeot 308 THP - Branco",
                secondText = "Placa: GBR-9F90  Entrada: 08:30"
            )

            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "Peugeot 308 THP - Branco",
                secondText = "Placa: GBR-9F90  Entrada: 08:30"
            )
        }
    }
}