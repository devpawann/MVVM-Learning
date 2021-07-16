package com.pawan.mvvmlearning.data.api

import com.pawan.mvvmlearning.data.model.ArtistList
import com.pawan.mvvmlearning.data.model.MovieList
import com.pawan.mvvmlearning.data.model.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTVShows(@Query("api_key") apiKey: String): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtist(@Query("api_key") apiKey: String): Response<ArtistList>
}