package com.pawan.mvvmlearning.domain.repo

import com.pawan.mvvmlearning.data.model.ArtistList

interface ArtistRepository {

    suspend fun getArtists(): List<ArtistList.Artist>?
    suspend fun updateArtists(): List<ArtistList.Artist>?

}