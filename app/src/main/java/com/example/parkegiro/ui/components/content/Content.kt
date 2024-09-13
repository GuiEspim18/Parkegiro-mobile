package com.example.parkegiro.ui.components.content

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Content(content: @Composable () -> Unit) {
    Column(
        modifier = Modifier.padding(horizontal = 15.dp)
    ) {
        content()
    }
}