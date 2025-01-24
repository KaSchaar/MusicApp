package com.example.musicapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.musicapp.screens.StartScreen
import com.example.musicapp.screens.ProfileScreen
import com.example.musicapp.screens.SongListScreen

@Composable
fun MainNavigation() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "start"
    ) {
        // Startbildschirm
        composable("start") {
            StartScreen(
                onNavigateToProfile = {
                    navController.navigate("profile")
                }
            )
        }

        // Profilansicht
        composable("profile") {
            ProfileScreen(
                onNavigateToSongs = {
                    navController.navigate("song_list")
                },
                onBack = {
                    navController.popBackStack()
                }
            )
        }

        // Songliste
        composable("song_list") {
            SongListScreen(
                onBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}
