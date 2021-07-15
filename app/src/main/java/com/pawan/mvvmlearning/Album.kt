package com.pawan.mvvmlearning


import com.google.gson.annotations.SerializedName

class Album : ArrayList<Album.AlbumItem>(){
    data class AlbumItem(
        @SerializedName("id")
        val id: Int, // 100
        @SerializedName("title")
        val title: String, // enim repellat iste
        @SerializedName("userId")
        val userId: Int // 10
    )
}

