package com.pawan.mvvmlearning

import android.util.Log
import javax.inject.Inject

class ServiceProvider @Inject constructor() {
    init {
        Log.d("TAG", "Service provider init")

    }

    fun getConnection(){
        Log.d("TAG", "connection available")

    }
}