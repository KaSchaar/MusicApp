package com.example.musicapp.components


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.musicapp.data.DataSource

@Composable
fun SongList() {
    val songs = DataSource.songs

    LazyColumn {
        items(songs) { song ->
            SongItem(song = song)
        }
    }
}