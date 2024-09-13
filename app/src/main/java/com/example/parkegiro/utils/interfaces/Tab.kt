package com.example.parkegiro.utils.interfaces

import androidx.compose.runtime.Composable

data class Tab(val name: String, val content: @Composable () -> Unit)
