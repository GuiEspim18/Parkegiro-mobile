package com.example.parkegiro.ui.components.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.parkegiro.utils.interfaces.Button

@Composable
fun NavButtons(buttons: List<Button>) {
    var selected by remember {
        mutableIntStateOf(0)
    }

    Row(
        modifier = Modifier.fillMaxWidth(),
    ) {
        for (index in 0 until  buttons.size) {
            NavButton(
                text = buttons.get(index).text,
                onClick = {
                    selected = index
                    buttons.get(index).onClick()
                },
                modifier = Modifier.padding(horizontal = 2.dp),
                selected = selected == index
            )
        }
    }
}