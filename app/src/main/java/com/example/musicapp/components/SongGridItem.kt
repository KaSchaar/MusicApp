package com.example.musicapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.example.musicapp.R
import com.example.musicapp.data.Song

@Composable
fun SongGridItem(song: Song) {
    Column(
        modifier = Modifier.padding(8.dp).fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ludwig_image),
            contentDescription = "Song Thumbnail",
            modifier = Modifier.fillMaxWidth(0.6f)
        )
        Text(text = song.title, maxLines = 1, textAlign = TextAlign.Center, modifier = Modifier.padding(top = 8.dp))
        Text(text = song.artist, maxLines = 1, textAlign = TextAlign.Center)
    }
}
