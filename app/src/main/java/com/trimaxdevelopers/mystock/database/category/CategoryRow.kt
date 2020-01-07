package com.trimaxdevelopers.mystock.database.category

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "categories")
class CategoryRow(
    @PrimaryKey val cid: Int,
    @ColumnInfo(name = "category_name") val categoryName: String?
)