package com.pawan.mvvmlearning.domain.usecases

import com.pawan.mvvmlearning.data.model.ArtistList
import com.pawan.mvvmlearning.domain.repo.ArtistRepository


class GetArtistUseCase(private val repository: ArtistRepository) {

    suspend fun execute(): List<ArtistList.Artist>? = repository.getArtists()
}