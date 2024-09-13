package com.example.parkegiro.ui.components.buttons

import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.parkegiro.ui.theme.Gray
import com.example.parkegiro.ui.theme.MainBlue
import com.example.parkegiro.ui.theme.SoftGray
import com.example.parkegiro.ui.theme.White

@Composable
fun NavButton(text: String, onClick: () -> Unit, selected: Boolean = false, modifier: Modifier = Modifier) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (!selected) SoftGray else Gray
        ),
        shape = RoundedCornerShape(topStart = 5.dp, topEnd = 5.dp, bottomEnd = 0.dp, bottomStart = 0.dp),
        modifier = Modifier
            .padding(0.dp)
            .heightIn(max = 40.dp)
            .then(modifier),
    ) {
        Text(
            text = text,
            color = if (!selected) White else MainBlue
        )
    }
}