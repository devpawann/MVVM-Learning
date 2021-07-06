package com.pawan.mvvmlearning

import androidx.lifecycle.ViewModel

class AccumulateViewModel(private val initialCount:Int) : ViewModel() {
    private var sum: Int = 0;

    init {
        sum=initialCount
    }

    fun getCurrentSum(): Int {
        return sum;
    }

    fun addNumber(num: Int): Int {
        sum += num
        return sum
    }
}