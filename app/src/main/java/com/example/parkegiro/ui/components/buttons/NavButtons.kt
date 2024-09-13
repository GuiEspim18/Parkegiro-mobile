package com.example.parkegiro.ui.components.buttons

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.parkegiro.utils.interfaces.Button

@Composable
fun NavButtons(buttons: List<Button>) {
    Row() {
        buttons.forEach {
            button -> NavButton(text = button.text, onClick = button.onClick)
        }
    }
}

@Preview
@Composable
fun Preview() {
    NavButtons(buttons = listOf(Button("Home", { })))
}