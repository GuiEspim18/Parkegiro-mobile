package com.example.parkegiro.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parkegiro.R
import com.example.parkegiro.ui.components.buttons.SecondaryBlueButton
import com.example.parkegiro.ui.components.cards.DoubleTextCard
import com.example.parkegiro.ui.components.contentHolder.ContentHolder
import com.example.parkegiro.ui.theme.MainBlue
import com.example.parkegiro.ui.theme.SecondaryBlue
import com.example.parkegiro.ui.theme.White

@Composable
fun Home() {
    Column{
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 5.dp, end = 15.dp, start = 15.dp)
        ) {
            item {
                Text(
                    text = "WM Park",
                    color = MainBlue,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(20.dp))
                DoubleTextCard(
                    firstText = "Total de 25 vagas",
                    secondText = "18 vagas oculpadas",
                    cardColor = SecondaryBlue,
                    textColor = White
                )
                Spacer(modifier = Modifier.height(20.dp))
                ContentHolder(title = "Carros Estacionados", icon = R.drawable.car) {

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
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        SecondaryBlueButton(text = "Ver Mais")
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                ContentHolder(title = "Faturamento Diário", icon = R.drawable.money) {
                    Spacer(modifier = Modifier.height(20.dp))
                    DoubleTextCard(
                        firstText = "R$: 250,00",
                        secondText = "Entradas: 18  Saídas: 18"
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        SecondaryBlueButton(text = "Ver Mais")
                    }
                }
            }
        }
    }
}