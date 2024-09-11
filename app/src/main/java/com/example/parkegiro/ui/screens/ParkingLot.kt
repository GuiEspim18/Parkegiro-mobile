package com.example.parkegiro.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.parkegiro.R
import com.example.parkegiro.ui.components.buttons.IconButton
import com.example.parkegiro.ui.components.cards.DoubleTextCard
import com.example.parkegiro.ui.components.contentHolder.ScrollContentHolder
import com.example.parkegiro.ui.theme.Orange
import com.example.parkegiro.ui.theme.Red

@Composable
fun ParkingLot() {
    Column {
        ScrollContentHolder(title = "Pátio", icon = R.drawable.car, divider = false) {

            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "GBR-9F90",
                secondText = "Entrada: 08:30",
                actions = listOf(
                    {
                        IconButton(icon = R.drawable.edit, iconSize = 19.dp, iconColor = Orange, onClick = { /*TODO*/ })
                    },
                    {
                        IconButton(icon = R.drawable.delete, iconSize = 19.dp, iconColor = Red, onClick = { /*TODO*/ })
                    }
                )
            )

            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "GBR-9F90",
                secondText = "Entrada: 08:30",
                actions = listOf(
                    {
                        IconButton(icon = R.drawable.edit, iconSize = 19.dp, iconColor = Orange, onClick = { /*TODO*/ })
                    },
                    {
                        IconButton(icon = R.drawable.delete, iconSize = 19.dp, iconColor = Red, onClick = { /*TODO*/ })
                    }
                )
            )

            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "GBR-9F90",
                secondText = "Entrada: 08:30",
                actions = listOf(
                    {
                        IconButton(icon = R.drawable.edit, iconSize = 19.dp, iconColor = Orange, onClick = { /*TODO*/ })
                    },
                    {
                        IconButton(icon = R.drawable.delete, iconSize = 19.dp, iconColor = Red, onClick = { /*TODO*/ })
                    }
                )
            )

            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "GBR-9F90",
                secondText = "Entrada: 08:30",
                actions = listOf(
                    {
                        IconButton(icon = R.drawable.edit, iconSize = 19.dp, iconColor = Orange, onClick = { /*TODO*/ })
                    },
                    {
                        IconButton(icon = R.drawable.delete, iconSize = 19.dp, iconColor = Red, onClick = { /*TODO*/ })
                    }
                )
            )

            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "GBR-9F90",
                secondText = "Entrada: 08:30",
                actions = listOf(
                    {
                        IconButton(icon = R.drawable.edit, iconSize = 19.dp, iconColor = Orange, onClick = { /*TODO*/ })
                    },
                    {
                        IconButton(icon = R.drawable.delete, iconSize = 19.dp, iconColor = Red, onClick = { /*TODO*/ })
                    }
                )
            )

            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "GBR-9F90",
                secondText = "Entrada: 08:30",
                actions = listOf(
                    {
                        IconButton(icon = R.drawable.edit, iconSize = 19.dp, iconColor = Orange, onClick = { /*TODO*/ })
                    },
                    {
                        IconButton(icon = R.drawable.delete, iconSize = 19.dp, iconColor = Red, onClick = { /*TODO*/ })
                    }
                )
            )

            Spacer(modifier = Modifier.height(20.dp))
            DoubleTextCard(
                firstText = "GBR-9F90",
                secondText = "Entrada: 08:30",
                actions = listOf(
                    {
                        IconButton(icon = R.drawable.edit, iconSize = 19.dp, iconColor = Orange, onClick = { /*TODO*/ })
                    },
                    {
                        IconButton(icon = R.drawable.delete, iconSize = 19.dp, iconColor = Red, onClick = { /*TODO*/ })
                    }
                )
            )

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}