package com.pawan.mvvmlearning.domain.repo

import com.pawan.mvvmlearning.data.model.TvShowList

interface TvShowRepository {

    suspend fun getTvShow():List<TvShowList.TvShow>?
    suspend fun updateTvShows():List<TvShowList.TvShow>?
}