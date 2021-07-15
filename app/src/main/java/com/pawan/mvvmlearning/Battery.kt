package com.pawan.mvvmlearning

import android.util.Log
import javax.inject.Inject

class Battery @Inject constructor(){
    init {
        Log.d("TAG","Battery constructed")

    }

    fun getPower(){
        Log.d("TAG","Battery power 60%")
    }
}