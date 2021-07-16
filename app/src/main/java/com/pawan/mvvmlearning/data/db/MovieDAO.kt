package com.pawan.mvvmlearning.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.pawan.mvvmlearning.data.model.MovieList

@Dao
interface MovieDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovies(movies: List<MovieList.Movie>)

    @Query("Delete from popular_movie")
    suspend fun deleteAllMovies()

    @Query("Select * from popular_movie")
    suspend fun getAllMovies()
}