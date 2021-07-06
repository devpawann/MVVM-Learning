package com.pawan.mvvmlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.pawan.mvvmlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ActivityMainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(ActivityMainViewModel::class.java)

        viewModel.countData.observe(this) {
            binding.apply {
                tvCount.text = it.toString()

                incrementBtn.setOnClickListener {
                    viewModel.incrementCount()
                }

                btnAccumulate.setOnClickListener {
                    val intent = Intent(this@MainActivity, AccumulateActivity::class.java)
                    startActivity(intent)
                }
            }
        }


    }
}