package com.pawan.mvvmlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.pawan.mvvmlearning.databinding.ActivitySpinnerBinding

class SpinnerActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySpinnerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_spinner)

        binding.btnProgressControl.setOnClickListener {
            changeSpinner()
        }
    }

    private fun changeSpinner() {
        binding.apply {
            if (progressBar.visibility == View.GONE) {
                progressBar.visibility = View.VISIBLE
                btnProgressControl.text = "Stop"
            } else {
                progressBar.visibility = View.GONE
                btnProgressControl.text = "Start"
            }
        }


    }
}