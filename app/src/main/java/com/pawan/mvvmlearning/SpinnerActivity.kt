package com.pawan.mvvmlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.pawan.mvvmlearning.databinding.ActivitySpinnerBinding

class SpinnerActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySpinnerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_spinner)

        binding.btnProgressControl.setOnClickListener {
            changeSpinner()
        }
    }

    private fun changeSpinner() {
        if(binding.progressBar.visibility== View.GONE){
            binding.progressBar.visibility=View.VISIBLE
            binding.btnProgressControl.text="Stop"
        }else{
            binding.progressBar.visibility=View.GONE
            binding.btnProgressControl.text="Start"
        }
    }
}