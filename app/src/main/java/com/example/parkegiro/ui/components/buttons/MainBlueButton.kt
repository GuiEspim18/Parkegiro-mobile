package com.example.parkegiro.ui.components.buttons

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.example.parkegiro.ui.theme.MainBlue
import com.example.parkegiro.ui.theme.White

@Composable
fun MainBlueButton(text: String, on_click: () -> Unit = { }) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = MainBlue
        ),
        shape = RoundedCornerShape(10.dp),
        onClick = on_click
    ) {
        Text(
            text = text,
            color = White
        )
    }
}