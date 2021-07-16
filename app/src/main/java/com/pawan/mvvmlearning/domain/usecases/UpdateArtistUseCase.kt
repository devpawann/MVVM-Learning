package com.pawan.mvvmlearning.domain.usecases

import com.pawan.mvvmlearning.data.model.ArtistList
import com.pawan.mvvmlearning.domain.repo.ArtistRepository

class UpdateArtistUseCase(private val repository: ArtistRepository) {

    suspend fun execute(): List<ArtistList.Artist>? = repository.updateArtists()
}