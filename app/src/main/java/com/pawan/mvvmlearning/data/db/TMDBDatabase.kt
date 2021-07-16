package com.pawan.mvvmlearning.data.db

import androidx.room.Database
import com.pawan.mvvmlearning.data.model.ArtistList
import com.pawan.mvvmlearning.data.model.MovieList
import com.pawan.mvvmlearning.data.model.TvShowList

@Database(
    entities = [ArtistList.Artist::class, MovieList.Movie::class, TvShowList.TvShow::class],
    version = 1, exportSchema = false
)
abstract class TMDBDatabase {
    abstract fun movieDao(): MovieDAO
    abstract fun artistDao(): ArtistDao
    abstract fun tvShowDao(): TvShowDAO
}