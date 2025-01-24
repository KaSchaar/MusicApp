package com.example.musicapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.musicapp.data.Song


@Composable
fun SongItem(song: Song) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = song.title, maxLines = 1)
        Text(text = song.artist, maxLines = 1)
        Text(text = song.duration, maxLines = 1)
    }
}