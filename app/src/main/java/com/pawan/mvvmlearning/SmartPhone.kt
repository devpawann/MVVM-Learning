package com.pawan.mvvmlearning

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(private val battery: Battery, private val simCard: SimCard, private val memoryCard: MemoryCard) {

    init {
        battery.getPower()
        simCard.getConnection()
        memoryCard.getSpace()

    }

    fun makeCall() {
        Log.d("TAG", "Calling......")
    }
}