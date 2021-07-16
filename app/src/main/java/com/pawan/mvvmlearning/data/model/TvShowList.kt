package com.pawan.mvvmlearning.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class TvShowList(
    @SerializedName("page")
    val page: Int, // 1
    @SerializedName("tvShows")
    val tvShows: List<TvShow>,
    @SerializedName("total_pages")
    val totalPages: Int, // 500
    @SerializedName("total_results")
    val totalResults: Int // 10000
) {

    @Entity(tableName = "popular_tv_show")
    data class TvShow(
        @SerializedName("backdrop_path")
        val backdropPath: String, // /xxlteGxXhpgnoMF7SvdYwHvljnB.jpg
        @SerializedName("first_air_date")
        val firstAirDate: String, // 2021-06-09
        @SerializedName("genre_ids")
        val genreIds: List<Int>,

        @PrimaryKey
        @SerializedName("id")
        val id: Int, // 84958
        @SerializedName("name")
        val name: String, // Loki
        @SerializedName("origin_country")
        val originCountry: List<String>,
        @SerializedName("original_language")
        val originalLanguage: String, // en
        @SerializedName("original_name")
        val originalName: String, // Loki
        @SerializedName("overview")
        val overview: String, // After stealing the Tesseract during the events of “Avengers: Endgame,” an alternate version of Loki is brought to the mysterious Time Variance Authority, a bureaucratic organization that exists outside of time and space and monitors the timeline. They give Loki a choice: face being erased from existence due to being a “time variant”or help fix the timeline and stop a greater threat.
        @SerializedName("popularity")
        val popularity: Double, // 8925.22
        @SerializedName("poster_path")
        val posterPath: String, // /kEl2t3OhXc3Zb9FBh1AuYzRTgZp.jpg
        @SerializedName("vote_average")
        val voteAverage: Double, // 8.2
        @SerializedName("vote_count")
        val voteCount: Int // 6072
    )
}