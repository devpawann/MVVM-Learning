package com.pawan.mvvmlearning

import androidx.lifecycle.ViewModel

class AccumulateViewModel : ViewModel() {
    private var sum: Int = 0;

    fun getCurrentSum(): Int {
        return sum;
    }

    fun addNumber(num: Int): Int {
        sum += num
        return sum
    }
}