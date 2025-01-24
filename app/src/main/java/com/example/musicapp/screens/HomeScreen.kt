package com.example.musicapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.material3.Text

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Bohemian Rhapsody - Queen",
            modifier = Modifier.clickable {
                navController.navigate("play_screen/Bohemian Rhapsody/Queen/5:55")
            }
        )
        Text(
            text = "Stairway to Heaven - Led Zeppelin",
            modifier = Modifier.clickable {
                navController.navigate("play_screen/Stairway to Heaven/Led Zeppelin/8:02")
            }
        )
        Text(
            text = "Imagine - John Lennon",
            modifier = Modifier.clickable {
                navController.navigate("play_screen/Imagine/John Lennon/3:01")
            }
        )
    }
}
