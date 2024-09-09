package com.example.parkegiro.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.parkegiro.R
import com.example.parkegiro.ui.components.buttons.MainBlueButton
import com.example.parkegiro.ui.components.cards.DoubleTextCard
import com.example.parkegiro.ui.components.contentHolder.ContentHolder
import com.example.parkegiro.ui.components.headers.Header
import com.example.parkegiro.ui.components.menus.NavMenu
import com.example.parkegiro.ui.theme.SecondaryBlue
import com.example.parkegiro.ui.theme.White

@Composable
fun Home() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White)
    ) {
        Header()
        Column(
            modifier = Modifier.weight(1f)
        ) {
            LazyColumn (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp, end = 15.dp, start = 15.dp)
            ) {
                item {
                    DoubleTextCard(firstText = "Total de 25 vagas", secondText = "18 vagas oculpadas", cardColor = SecondaryBlue, textColor = White)
                    Spacer(modifier = Modifier.height(20.dp))
                    ContentHolder(title = "Carros Estacionados", icon = R.drawable.car) {

                        Spacer(modifier = Modifier.height(20.dp))
                        DoubleTextCard(firstText = "Peugeot 308 THP - Branco", secondText = "Placa: GBR-9F90  Entrada: 08:30")

                        Spacer(modifier = Modifier.height(20.dp))
                        DoubleTextCard(firstText = "Peugeot 308 THP - Branco", secondText = "Placa: GBR-9F90  Entrada: 08:30")

                        Spacer(modifier = Modifier.height(20.dp))
                        DoubleTextCard(firstText = "Peugeot 308 THP - Branco", secondText = "Placa: GBR-9F90  Entrada: 08:30")

                        Spacer(modifier = Modifier.height(20.dp))
                        DoubleTextCard(firstText = "Peugeot 308 THP - Branco", secondText = "Placa: GBR-9F90  Entrada: 08:30")

                        Spacer(modifier = Modifier.height(20.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            MainBlueButton(text = "Ver Mais")
                        }
                    }
                }
            }
        }
        NavMenu()
    }
}