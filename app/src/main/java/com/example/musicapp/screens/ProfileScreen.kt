package com.example.musicapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicapp.R

@Composable
fun ProfileScreen(username: String, onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Profilbild
        Image(
            painter = painterResource(id = R.drawable.profile_picture), // Passe dies an deine Ressource an
            contentDescription = "Profilbild",
            modifier = Modifier
                .size(150.dp)
                .padding(8.dp),
            contentScale = ContentScale.Crop
        )

        // Username
        Text(
            text = username,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(8.dp)
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
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Follow", color = Color.White)
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

        // Zurück-Button
        Button(
            onClick = onBack, // Rücknavigation ausführen
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
            modifier = Modifier.padding(top = 32.dp)
        ) {
            Text(text = "Zurück", color = Color.White)
        }
    }
}

// Einfache Genre-Chip-Komponente
@Composable
fun GenreChip(genre: String) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .wrapContentSize(),
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
