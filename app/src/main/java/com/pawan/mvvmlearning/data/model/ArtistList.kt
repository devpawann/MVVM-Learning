package com.pawan.mvvmlearning.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

data class ArtistList(
    @SerializedName("page")
    val page: Int, // 1
    @SerializedName("artists")
    val artists: List<Artist>,
    @SerializedName("total_pages")
    val totalPages: Int, // 500
    @SerializedName("total_results")
    val totalResults: Int // 10000
) {
    @Entity(tableName = "popular_artist")
    data class Artist(
        @SerializedName("adult")
        val adult: Boolean, // false

        @PrimaryKey
        @SerializedName("gender")
        val gender: Int, // 1
        @SerializedName("id")
        val id: Int, // 1245
        @SerializedName("known_for")
        val knownFor: List<KnownFor>,
        @SerializedName("known_for_department")
        val knownForDepartment: String, // Acting
        @SerializedName("name")
        val name: String, // Scarlett Johansson
        @SerializedName("popularity")
        val popularity: Double, // 97.799
        @SerializedName("profile_path")
        val profilePath: String // /6NsMbJXRlDZuDzatN2akFdGuTvx.jpg
    ) {
        data class KnownFor(
            @SerializedName("adult")
            val adult: Boolean, // false
            @SerializedName("backdrop_path")
            val backdropPath: String, // /nNmJRkg8wWnRmzQDe2FwKbPIsJV.jpg
            @SerializedName("first_air_date")
            val firstAirDate: String, // 2016-04-25
            @SerializedName("genre_ids")
            val genreIds: List<Int>,
            @SerializedName("id")
            val id: Int, // 24428
            @SerializedName("media_type")
            val mediaType: String, // movie
            @SerializedName("name")
            val name: String, // Flowers
            @SerializedName("origin_country")
            val originCountry: List<String>,
            @SerializedName("original_language")
            val originalLanguage: String, // en
            @SerializedName("original_name")
            val originalName: String, // Flowers
            @SerializedName("original_title")
            val originalTitle: String, // The Avengers
            @SerializedName("overview")
            val overview: String, // When an unexpected enemy emerges and threatens global safety and security, Nick Fury, director of the international peacekeeping agency known as S.H.I.E.L.D., finds himself in need of a team to pull the world back from the brink of disaster. Spanning the globe, a daring recruitment effort begins!
            @SerializedName("poster_path")
            val posterPath: String, // /RYMX2wcKCBAr24UyPD7xwmjaTn.jpg
            @SerializedName("release_date")
            val releaseDate: String, // 2012-04-25
            @SerializedName("title")
            val title: String, // The Avengers
            @SerializedName("video")
            val video: Boolean, // false
            @SerializedName("vote_average")
            val voteAverage: Double, // 7.7
            @SerializedName("vote_count")
            val voteCount: Int // 24976
        )
    }
}