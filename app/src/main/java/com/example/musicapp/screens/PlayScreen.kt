package com.example.musicapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.musicapp.R // Sicherstellen, dass dieser Import korrekt ist
import com.example.musicapp.data.Song

@Composable
fun PlayScreen(song: Song, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Album-Cover mit Fallback
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background), // Fallback-Bild: ic_launcher_background
            contentDescription = "Album Cover",
            modifier = Modifier.size(200.dp)
        )

        // Song-Details
        Text(
            text = song.title,
            modifier = Modifier.padding(8.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Artist: ${song.artist}",
            modifier = Modifier.padding(8.dp),
            textAlign = TextAlign.Center
        )

        // Zurück-Button
        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text(text = "Zurück")
        }
    }
}


