package com.pawan.mvvmlearning.domain.usecases

import com.pawan.mvvmlearning.data.model.MovieList
import com.pawan.mvvmlearning.domain.repo.MoviesRepository


class UpdateMovieUseCase(private val moviesRepository: MoviesRepository) {
    suspend fun execute(): List<MovieList.Movie>? {
        return moviesRepository.updateMovies()
    }
}
