package com.pawan.mvvmlearning.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class MovieList(
    @SerializedName("page")
    val page: Int, // 1
    @SerializedName("tvShows")
    val results: List<Movie>,
    @SerializedName("total_pages")
    val totalPages: Int, // 500
    @SerializedName("total_results")
    val totalResults: Int // 10000
) {
    @Entity(tableName = "popular_movie")
    data class Movie(
        @SerializedName("adult")
        val adult: Boolean, // false
        @SerializedName("backdrop_path")
        val backdropPath: String, // /dq18nCTTLpy9PmtzZI6Y2yAgdw5.jpg
        @SerializedName("genre_ids")
        val genreIds: List<Int>,

        @PrimaryKey
        @SerializedName("id")
        val id: Int, // 497698
        @SerializedName("original_language")
        val originalLanguage: String, // en
        @SerializedName("original_title")
        val originalTitle: String, // Black Widow
        @SerializedName("overview")
        val overview: String, // Natasha Romanoff, also known as Black Widow, confronts the darker parts of her ledger when a dangerous conspiracy with ties to her past arises. Pursued by a force that will stop at nothing to bring her down, Natasha must deal with her history as a spy and the broken relationships left in her wake long before she became an Avenger.
        @SerializedName("popularity")
        val popularity: Double, // 9790.858
        @SerializedName("poster_path")
        val posterPath: String, // /qAZ0pzat24kLdO3o8ejmbLxyOac.jpg
        @SerializedName("release_date")
        val releaseDate: String, // 2021-07-07
        @SerializedName("title")
        val title: String, // Black Widow
        @SerializedName("video")
        val video: Boolean, // false
        @SerializedName("vote_average")
        val voteAverage: Double, // 8.2
        @SerializedName("vote_count")
        val voteCount: Int // 2209
    )
}