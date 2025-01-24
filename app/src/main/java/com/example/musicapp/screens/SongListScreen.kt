package com.example.musicapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment

data class Song(val title: String, val artist: String, val duration: String)

val songs = listOf(
    Song("Bohemian Rhapsody", "Queen", "5:55"),
    Song("Stairway to Heaven", "Led Zeppelin", "8:02"),
    Song("Imagine", "John Lennon", "3:01"),
    Song("Smells Like Teen Spirit", "Nirvana", "5:01"),
    Song("Hotel California", "Eagles", "6:30")
)

@Composable
fun SongListScreen(onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Songliste",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn(
            modifier = Modifier.fillMaxHeight().weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(songs) { song ->
                SongItem(song)
            }
        }

        Button(onClick = onBack, modifier = Modifier.padding(top = 16.dp)) {
            Text(text = "Zurück zum Profil")
        }
    }
}

@Composable
fun SongItem(song: Song) {
    Column(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
        Text(text = "Title: ${song.title}")
        Text(text = "Artist: ${song.artist}")
        Text(text = "Duration: ${song.duration}")
    }
}
