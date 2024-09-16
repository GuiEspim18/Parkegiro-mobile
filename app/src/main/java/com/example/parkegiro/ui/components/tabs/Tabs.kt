package com.example.parkegiro.ui.components.tabs

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.parkegiro.ui.components.buttons.NavButtons
import com.example.parkegiro.ui.theme.Gray
import com.example.parkegiro.utils.interfaces.Button
import com.example.parkegiro.utils.interfaces.Tab

@Composable
fun Tabs(tabs: List<Tab>) {

    var content by remember {
        mutableStateOf<@Composable () -> Unit>({
            tabs.get(0).content()
        })
    }

    val buttons: MutableList<Button> = mutableListOf()
    for (tab in tabs) {
        buttons.add(Button(tab.name, { content = tab.content }))
    }
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
    ){
        Row(
            modifier = Modifier
                .padding(horizontal = 5.dp)
                .fillMaxWidth()
        ){
            NavButtons(buttons = buttons)
        }
        Box (
            modifier = Modifier
                .fillMaxHeight()
                .background(Gray)
        ) {
            content()
        }
    }
}