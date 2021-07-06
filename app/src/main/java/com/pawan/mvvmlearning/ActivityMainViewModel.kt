package com.pawan.mvvmlearning

import androidx.lifecycle.ViewModel

class ActivityMainViewModel : ViewModel() {
    private var count: Int = 0

    fun getCurrentCount(): Int {
        return count
    }

    fun getIncrementedCount(): Int {
        return ++count
    }
}