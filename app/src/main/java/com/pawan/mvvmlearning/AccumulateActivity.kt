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
        factory=AccumulateViewModelFactory(200)
        viewModel = ViewModelProvider(this,factory).get(AccumulateViewModel::class.java)


        binding.apply {
            tvResult.text=viewModel.getCurrentSum().toString()

            button.setOnClickListener {
                val num:Int=etNumber1.text.toString().toInt()
                tvResult.text=viewModel.addNumber(num).toString()
                etNumber1.text.clear()

            }
        }
    }
}