package com.pawan.mvvmlearning.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.pawan.mvvmlearning.data.model.ArtistList


@Dao
interface ArtistDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArtists(movies: List<ArtistList.Artist>)

    @Query("Delete from popular_artist")
    suspend fun deleteAllArtists()

    @Query("Select * from popular_artist")
    suspend fun getAllArtists()
}