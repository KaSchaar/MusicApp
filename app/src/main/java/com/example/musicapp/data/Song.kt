package com.example.musicapp.data

import kotlinx.serialization.Serializable

@Serializable
data class Song(
    val title: String,
    val artist: String,
    val duration: String  // Dauer des Songs
)
