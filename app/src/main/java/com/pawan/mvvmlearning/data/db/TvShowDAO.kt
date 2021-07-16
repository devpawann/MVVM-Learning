package com.pawan.mvvmlearning.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.pawan.mvvmlearning.data.model.MovieList
import com.pawan.mvvmlearning.data.model.TvShowList

@Dao
interface TvShowDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTvShow(movies: List<TvShowList.TvShow>)

    @Query("Delete from popular_tv_show")
    suspend fun deleteAllTvShow()

    @Query("Select * from popular_tv_show")
    suspend fun getAllTvShow()
}