package com.example.musicapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.navigation.MainNavigation // Navigation importieren
import com.example.musicapp.ui.theme.MusicAppTheme // Theme importieren

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MusicAppTheme {
                // Navigation starten
                MainNavigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MusicAppTheme {
        // Vorschau mit deinem bestehenden SongList-Element
        // Diese Funktion bleibt unverändert, da sie nur in der IDE verwendet wird
        com.example.musicapp.components.SongList()
    }
}
