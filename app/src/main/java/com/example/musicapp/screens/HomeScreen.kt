package com.example.musicapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Klickbarer Text, um zum Profil zu navigieren
        ClickableText(
            text = AnnotatedString("Gehe zum Profil"),
            modifier = Modifier.padding(8.dp),
            onClick = {
                // Navigation zum Profil-Bildschirm mit einem Parameter
                navController.navigate("profile/Katy")
            }
        )
    }
}


