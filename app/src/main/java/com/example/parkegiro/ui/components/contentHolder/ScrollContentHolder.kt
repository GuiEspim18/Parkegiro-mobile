package com.example.parkegiro.ui.components.contentHolder

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parkegiro.ui.components.icon.Icon
import com.example.parkegiro.ui.theme.MainBlue

@Composable
fun ScrollContentHolder(title: String, icon: Int? = null, divider: Boolean = true, content: @Composable () -> Unit) {
    if (divider) {
        Divider(
            modifier = Modifier.height(1.dp),
            color = MainBlue
        )
        Spacer(modifier = Modifier.height(20.dp))
    }
    Column (
        modifier = Modifier.padding(top = 5.dp, end = 15.dp, start = 15.dp)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (icon != null) {
                Icon(icon = icon, color = MainBlue)
                Spacer(modifier = Modifier.width(10.dp))
            }
            Text(
                text = title,
                color = MainBlue,
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp
            )
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()

        ) {
            item {
               content()
            }
        }
    }
}