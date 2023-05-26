package com.works.days_18.configs

import androidx.room.Database
import androidx.room.RoomDatabase
import com.works.days_18.dao.NoteDao
import com.works.days_18.models.Note

@Database(entities = [Note::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
}