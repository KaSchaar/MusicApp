package com.example.musicapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.musicapp.data.Song
import com.example.musicapp.screens.HomeScreen
import com.example.musicapp.screens.PlayScreen
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Composable
fun MainNavigation() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        // Home-Screen
        composable("home") { HomeScreen(navController) }

        // Abspiel-Screen
        composable(
            route = "play_screen/{song}",
            arguments = listOf(
                navArgument("song") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            val songJson = backStackEntry.arguments?.getString("song")
            val song = Json.decodeFromString<Song>(songJson!!)
            PlayScreen(song = song, navController = navController)
        }
    }
}
