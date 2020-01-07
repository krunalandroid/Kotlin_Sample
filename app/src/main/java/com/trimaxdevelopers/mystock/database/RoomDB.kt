package com.trimaxdevelopers.mystock.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.trimaxdevelopers.mystock.database.category.CategoryDao
import com.trimaxdevelopers.mystock.database.category.CategoryRow

@Database(entities = arrayOf(CategoryRow::class), version = 1)
abstract class RoomDB(val context: Context) : RoomDatabase() {

    abstract fun categoryDao(): CategoryDao

    val db = Room.databaseBuilder(
        context,
        RoomDB::class.java, "maindb"
    ).build()

}