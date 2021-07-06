package com.pawan.mvvmlearning

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class AccumulateViewModelFactory(private var initialCount:Int):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(AccumulateViewModel::class.java)){
            return AccumulateViewModel(initialCount) as T
        }
        throw IllegalArgumentException("View Model Not Found")
    }
}