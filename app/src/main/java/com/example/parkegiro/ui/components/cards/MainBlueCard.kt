package com.example.parkegiro.ui.components.cards

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parkegiro.ui.theme.SecondaryBlue
import com.example.parkegiro.ui.theme.White

@Composable
fun MainBlueCard() {
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
                .height(1.dp), color = White
            )
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
}