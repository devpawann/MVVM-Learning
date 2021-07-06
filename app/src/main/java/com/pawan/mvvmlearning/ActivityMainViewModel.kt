package com.pawan.mvvmlearning

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityMainViewModel : ViewModel() {
    private var count = MutableLiveData<Int>()
     val countData:LiveData<Int> get()=count

    init {
        count.value = 0
    }


    fun incrementCount() {
        count.value = count.value?.plus(1)
    }
}