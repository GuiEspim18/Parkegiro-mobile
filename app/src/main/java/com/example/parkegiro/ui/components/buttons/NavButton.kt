package com.example.parkegiro.ui.components.buttons

import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.parkegiro.ui.theme.Gray
import com.example.parkegiro.ui.theme.MainBlue

@Composable
fun NavButton(text: String, onClick: () -> Unit, selected: Boolean = false) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (!selected) Gray else MainBlue
        ),
        shape = RoundedCornerShape(topStart = 5.dp, topEnd = 5.dp, bottomEnd = 0.dp, bottomStart = 0.dp)
    ) {
        Text(
            text = text,
            color = if (!selected) MainBlue else Gray
        )
    }
}