package com.pawan.mvvmlearning

import android.util.Log
import javax.inject.Inject

class SimCard @Inject constructor(private val serviceProvider: ServiceProvider) {
    init {
        Log.d("TAG", "Sim init")
    }

    fun getConnection() {
        serviceProvider.getConnection()
    }
}