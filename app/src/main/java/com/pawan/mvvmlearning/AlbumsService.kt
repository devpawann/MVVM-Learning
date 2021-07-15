package com.pawan.mvvmlearning

import retrofit2.Response
import retrofit2.http.GET

interface AlbumsService {

    @GET("/albums")
    suspend fun getAlbums():Response<Album>
}