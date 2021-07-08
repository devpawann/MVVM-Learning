package com.pawan.mvvmlearning

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AccumulateViewModel(initialCount: Int) : ViewModel(), Observable {
    private var sum = MutableLiveData<Int>();
    val sumData: LiveData<Int> get() = sum

    @Bindable
    var input = MutableLiveData<String>()

    init {
        sum.value = initialCount
    }

    fun addNumber() {
        sum.value = sum.value?.plus(input.value!!.toInt())

    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {

    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
    }
}