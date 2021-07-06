package com.pawan.mvvmlearning

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AccumulateViewModel(private val initialCount: Int) : ViewModel() {
    private var sum = MutableLiveData<Int>();

    val sumData: LiveData<Int> get() = sum


    init {
        sum.value = initialCount
    }

    fun addNumber(num: Int) {
        sum.value = sum.value?.plus(num)

    }
}