package com.example.gridlayoutapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

@Composable
fun GridScreen() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 194.dp)
    ) {
        items(30) {
            GridItem()
        }
    }
}