package com.pawan.mvvmlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.pawan.mvvmlearning.databinding.ActivityAccumulateBinding

class AccumulateActivity : AppCompatActivity() {
    private lateinit var viewModel: AccumulateViewModel
    private lateinit var binding: ActivityAccumulateBinding
    private lateinit var factory: AccumulateViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_accumulate)
        factory = AccumulateViewModelFactory(200)
        viewModel = ViewModelProvider(this, factory).get(AccumulateViewModel::class.java)
        binding.myViewModel=viewModel
        binding.lifecycleOwner=this


    }
}