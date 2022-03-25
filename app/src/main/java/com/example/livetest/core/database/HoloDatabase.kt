package com.example.livetest.core.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class HoloDatabase : RoomDatabase() {

    abstract fun holoDao() : HoloDao

    companion object{
        @Volatile
        private var INSTANCE: HoloDatabase? = null

        fun getDatabase(context : Context):HoloDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    HoloDatabase::class.java,
                    "fav_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }

    }
}