package com.example.parkegiro.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.parkegiro.R
import com.example.parkegiro.ui.components.contentHolder.ScrollContentHolder

@Composable
fun Revenue() {
    Column {
        ScrollContentHolder(title = "Faturamento", icon = R.drawable.money, divider = false) {

        }
    }
}