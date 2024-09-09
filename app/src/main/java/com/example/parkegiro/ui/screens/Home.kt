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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parkegiro.R
import com.example.parkegiro.ui.components.buttons.MainBlueButton
import com.example.parkegiro.ui.components.headers.Header
import com.example.parkegiro.ui.components.icon.Icon
import com.example.parkegiro.ui.components.menus.NavMenu
import com.example.parkegiro.ui.theme.MainBlue
import com.example.parkegiro.ui.theme.SecondaryBlue
import com.example.parkegiro.ui.theme.SoftGray
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
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 30.dp, end = 15.dp, start = 15.dp)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = SecondaryBlue,
                    ),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(5.dp)

                ) {
                    Column(
                        modifier = Modifier
                            .background(Color.Transparent)
                            .padding(10.dp),
                    ) {
                        Text(
                            text = "Total de 25 vagas",
                            modifier = Modifier
                                .background(SecondaryBlue),
                            color = White,
                            fontSize = 25.sp
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Divider(modifier = Modifier
                            .height(1.dp), color = White)
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "18 Vagas Oculpadas",
                            modifier = Modifier
                                .background(SecondaryBlue),
                            color = White,
                            fontSize = 25.sp
                        )
                    }

                }
                Spacer(modifier = Modifier.height(20.dp))
                Divider(
                    modifier = Modifier.height(1.dp),
                    color = MainBlue
                )
                Spacer(modifier = Modifier.height(20.dp))
                Row (
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(icon = R.drawable.car, color = MainBlue)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Carros Estacionados",
                        color = MainBlue,
                        fontWeight = FontWeight.Bold,
                        fontSize = 28.sp
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Card (
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = SoftGray
                    ),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .background(Color.Transparent)
                            .padding(10.dp)
                    ) {
                        Text(
                            text = "Peugeot 308 THP - Branco",
                            color = MainBlue
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Divider(
                            modifier = Modifier
                                .height(1.dp),
                            color = MainBlue
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Row {
                            Text(
                                text = "Placa: ",
                                fontWeight = FontWeight.Bold,
                                color = MainBlue
                            )
                            Text(
                                text = "GBR-9F90",
                                color = MainBlue
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Card (
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = SoftGray
                    ),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .background(Color.Transparent)
                            .padding(10.dp)
                    ) {
                        Text(
                            text = "Peugeot 308 THP - Branco",
                            color = MainBlue
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Divider(
                            modifier = Modifier
                                .height(1.dp),
                            color = MainBlue
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Row {
                            Text(
                                text = "Placa: ",
                                fontWeight = FontWeight.Bold,
                                color = MainBlue
                            )
                            Text(
                                text = "GBR-9F90",
                                color = MainBlue
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Card (
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = SoftGray
                    ),
                    shape = RoundedCornerShape(10.dp),
                    elevation = CardDefaults.cardElevation(10.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .background(Color.Transparent)
                            .padding(10.dp)
                    ) {
                        Text(
                            text = "Peugeot 308 THP - Branco",
                            color = MainBlue
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Divider(
                            modifier = Modifier
                                .height(1.dp),
                            color = MainBlue
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Row {
                            Text(
                                text = "Placa: ",
                                fontWeight = FontWeight.Bold,
                                color = MainBlue
                            )
                            Text(
                                text = "GBR-9F90",
                                color = MainBlue
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    MainBlueButton(text = "Ver Mais")
                }
            }
        }
        NavMenu()
    }
}