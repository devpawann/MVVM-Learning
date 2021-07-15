package com.pawan.mvvmlearning

import android.util.Log
import javax.inject.Inject

class MemoryCard {

    init {
        Log.d("TAG", "memory card init")
    }


    fun getSpace() {
        Log.d("TAG", "Space available")
    }


}