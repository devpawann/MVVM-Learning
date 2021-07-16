package com.pawan.mvvmlearning.domain.repo

import com.pawan.mvvmlearning.data.model.MovieList

interface MoviesRepository {
    suspend fun getMovies():List<MovieList.Movie>?
    suspend fun updateMovies():List<MovieList.Movie>?
}