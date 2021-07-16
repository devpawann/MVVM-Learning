package com.pawan.mvvmlearning.domain.usecases

import com.pawan.mvvmlearning.data.model.TvShowList
import com.pawan.mvvmlearning.domain.repo.TvShowRepository

class GetTvShowUseCase(private val tvShowRepository: TvShowRepository) {

    suspend fun execute(): List<TvShowList.TvShow>? {
        return tvShowRepository.getTvShow()
    }
}