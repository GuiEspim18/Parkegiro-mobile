package com.example.parkegiro.ui.components.buttons

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.parkegiro.ui.theme.SecondaryBlue
import com.example.parkegiro.ui.theme.White

@Composable
fun SecondaryBlueButton(text: String, on_click: () -> Unit = { }) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = SecondaryBlue
        ),
        shape = RoundedCornerShape(5.dp),
        onClick = on_click
    ) {
        Text(
            text = text,
            color = White
        )
    }
}