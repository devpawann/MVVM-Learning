package com.pawan.mvvmlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofitService =
            RetrofitInstance.getRetrofitInstance().create(AlbumsService::class.java)

        val responseLiveData:LiveData<Response<Album>> = liveData {
            val response=retrofitService.getAlbums()
            emit(response)
        }

        responseLiveData.observe(this, Observer { it ->
            val albumsList=it.body()
            albumsList?.forEach{
             Log.d("TAG",it.toString())
            }
        })
    }
}