package com.example.parkegiro.ui.components.cards

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parkegiro.ui.theme.Gray
import com.example.parkegiro.ui.theme.MainBlue

@Composable
fun DoubleTextCard(firstText: String, secondText: String, cardColor: Color = Gray, textColor: Color = MainBlue, firstTextSize: TextUnit = 25.sp, secondTextSize: TextUnit = 20.sp, actions: List<@Composable () -> Unit>? = null) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = cardColor,
        ),
        shape = RoundedCornerShape(5.dp),
        elevation = CardDefaults.cardElevation(5.dp)

    ) {
        Row (
            modifier = Modifier
                .fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .background(Color.Transparent)
                    .padding(10.dp)
                    .weight(1f),
            ) {
                Text(
                    text = firstText,
                    modifier = Modifier
                        .background(Color.Transparent),
                    color = textColor,
                    fontSize = firstTextSize
                )
                Spacer(modifier = Modifier.height(10.dp))
                Divider(modifier = Modifier
                    .height(1.dp), color = textColor
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = secondText,
                    modifier = Modifier
                        .background(Color.Transparent),
                    color = textColor,
                    fontSize = secondTextSize
                )
            }
            if (actions != null) {
                Column {
                    actions.forEach{action ->
                        action()
                    }
                }
            }
        }

    }
}