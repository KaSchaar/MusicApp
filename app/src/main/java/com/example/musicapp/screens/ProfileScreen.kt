package com.example.musicapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicapp.R

@Composable
fun ProfileScreen(onNavigateToSongs: () -> Unit, onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Abstand oben hinzufügen
        Spacer(modifier = Modifier.height(32.dp))

        // Rundes Profilbild
        Image(
            painter = painterResource(id = R.drawable.profile_picture), // Profilbild-Ressource
            contentDescription = "Profilbild",
            modifier = Modifier
                .size(150.dp) // Bildgröße
                .clip(CircleShape) // Rund ausschneiden
                .padding(8.dp),
            contentScale = ContentScale.Crop // Bild zuschneiden, um es anzupassen
        )

        // Statistiken
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "245", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "Follower")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "180", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "Folgt")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "52", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = "Playlists")
            }
        }

        // "Follow"-Button
        Button(
            onClick = { /* Aktion hinzufügen */ },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Follow")
        }

        // Lieblingsgenres
        Text(
            text = "Lieblingsgenres",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier.padding(vertical = 16.dp)
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            GenreChip("Rock")
            GenreChip("Pop")
            GenreChip("Hip-Hop")
        }

        // Navigation Buttons
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = onNavigateToSongs, // Navigation zur Songliste
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Text(text = "Zu den Songs →")
        }
        Button(
            onClick = onBack, // Rücknavigation zum Start
            modifier = Modifier.padding(bottom = 8.dp)
        ) {
            Text(text = "Zurück zum Start")
        }
    }
}

@Composable
fun GenreChip(genre: String) {
    Box(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 4.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = genre,
            fontSize = 14.sp,
            color = Color.DarkGray,
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}
