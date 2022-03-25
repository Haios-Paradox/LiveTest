package com.example.livetest.core.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "idol_data")
data class Idols(
    @PrimaryKey(autoGenerate = false)
    val idol_id : String
)

@Entity(tableName = "channel_data")
data class Channels(
    val channel_id : String
)

@Entity(tableName = "video_data")
data class Videos(
    val video_id : String
)

@Entity(tableName = "video_playlist")//TODO: Insert Foreign Key
data class video_playlist(
    val video_id: String,
    val playlist_id: String
)

@Entity(tableName = "playlist_data")
data class Playlist(
    val playlist_id : String
)

@Entity(tableName = "oshi_data")
data class Oshis(
    val oshi_id : String
)

@Entity(tableName = "content")
data class Contents(
    val content_id : String
)