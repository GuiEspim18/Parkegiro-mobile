package com.example.parkegiro.ui.components.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.parkegiro.utils.interfaces.Button

@Composable
fun NavButtons(buttons: List<Button>) {
    Row(
        modifier = Modifier.fillMaxWidth(),
    ) {
        buttons.forEach {
            button ->
            NavButton(
                text = button.text,
                onClick = button.onClick,
                modifier = Modifier.padding(horizontal = 2.dp),
            )
        }
    }
}