package com.example.musicapp.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.musicapp.data.DataSource

@Composable
fun SongGrid() {
    val songs = DataSource.songs

    LazyVerticalGrid(
        columns = GridCells.Adaptive(150.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        items(songs) { song ->
            SongGridItem(song = song)
        }
    }
}
