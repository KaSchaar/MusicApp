package com.example.musicapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun PlayScreen(title: String, artist: String, duration: String, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Title: $title", modifier = Modifier.padding(8.dp))
        Text(text = "Artist: $artist", modifier = Modifier.padding(8.dp))
        Text(text = "Duration: $duration", modifier = Modifier.padding(8.dp))
        Button(onClick = { navController.popBackStack() }, modifier = Modifier.padding(top = 16.dp)) {
            Text(text = "Back")
        }
    }
}
