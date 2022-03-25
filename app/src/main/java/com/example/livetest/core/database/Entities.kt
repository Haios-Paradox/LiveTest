package com.example.livetest.core.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "idol_data")//This data is pre-populated
data class Idols(
    @PrimaryKey(autoGenerate = false)
    val idol_id : String,
    val channel_id : String,//TODO: This is a foreign key
    val idol_name : String,
)

@Entity(tableName = "channel_data")
data class Channels(
    @PrimaryKey(autoGenerate = false)
    val channel_id : String,
    val channel_avatar : String,
    val channel_type : String,
    var channel_follow : Boolean = false
)

@Entity(tableName = "video_data")
data class Videos(
    @PrimaryKey(autoGenerate = true)
    val video_id : String,
    val video_url : String,
    var video_fav : Boolean = false
)

@Entity(tableName = "video_playlist")
data class video_playlist(
    @PrimaryKey(autoGenerate = false)
    val list_id: String,
    val video_fk: String,
    val playlist_fk: String
)

@Entity(tableName = "playlist_data")
data class Playlist(
    @PrimaryKey(autoGenerate = false)
    val playlist_id : String,
    val playlist_name : String,
    val playlist_type : String
)

@Entity(tableName = "oshi_data")
data class Oshi(
    val oshi_id : String,
    val idol_fk : String,
    val oshi_nickname : String
)