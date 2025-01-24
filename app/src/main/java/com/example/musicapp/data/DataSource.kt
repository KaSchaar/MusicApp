package com.example.musicapp.data

import kotlinx.serialization.Serializable

@Serializable
data class Song(
    val title: String,
    val artist: String,
    val duration: String
)

object DataSource {
    val songs = listOf(
        Song("Bohemian Rhapsody", "Queen", "5:55"),
        Song("Stairway to Heaven", "Led Zeppelin", "8:02"),
        Song("Imagine", "John Lennon", "3:01")
    )
}
