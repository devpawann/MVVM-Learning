package com.pawan.mvvmlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import com.pawan.mvvmlearning.databinding.ActivityMainBinding
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val retrofitService =
            RetrofitInstance.getRetrofitInstance().create(AlbumsService::class.java)

        val responseLiveData: LiveData<Response<Album>> = liveData {
            //val response = retrofitService.getAlbums()
            val response = retrofitService.getAlbumsOfSingleUserId(3)
            emit(response)
        }

        responseLiveData.observe(this, Observer { it ->
            val albumsList = it.body()
            albumsList?.forEach {
                Log.d("TAG", it.toString())

                binding.tvAlbum.append(it.toString()+"\n\n")
            }
        })
    }
}