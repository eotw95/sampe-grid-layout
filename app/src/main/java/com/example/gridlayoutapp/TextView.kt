package com.example.gridlayoutapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextView(text: String) {
    Surface(
        modifier = Modifier
            .padding(30.dp)
    ) {
        Text(text = text)
    }
}