package com.trimaxdevelopers.mystock.database.category

import androidx.room.*

@Dao
interface CategoryDao {

    @Query("SELECT * FROM categories")
    fun getAllRows(): List<CategoryRow>

    @Query("SELECT * FROM categories WHERE cid IN (:id)")
    fun getRowById(id: Int): CategoryRow

    @Insert
    fun insert(row: CategoryRow): Long

    @Insert
    fun insertMultiple(vararg rows: CategoryRow): Array<Long>

    @Insert
    fun insertMultiple(rows: List<CategoryRow>): Array<Long>

    @Update
    fun update(row: CategoryRow)

    @Update
    fun updateMultiple(rows: List<CategoryRow>)

    @Update
    fun updateMultiple(vararg rows: CategoryRow)

    @Delete
    fun delete(row: CategoryRow)

    @Delete
    fun deleteMultiple(rows: List<CategoryRow>)

    @Delete
    fun deleteMultiple(vararg rows: CategoryRow)

    @Query("DELETE FROM categories")
    fun deleteAll()
}