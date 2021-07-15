package com.pawan.mvvmlearning

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface AlbumsService {

    @GET("/albums")
    suspend fun getAlbums(): Response<Album>

    @GET("/albums")
    suspend fun getAlbumsOfSingleUserId(@Query("userId") userId: Int): Response<Album>
}