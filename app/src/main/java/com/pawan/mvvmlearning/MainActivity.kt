package com.pawan.mvvmlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.pawan.mvvmlearning.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.incrementButton.setOnClickListener {
            binding.tvCount.text = count++.toString()
            Log.i("TTT", "Downloading i in Thread ${Thread.currentThread().name}")
        }

        binding.buttonDownload.setOnClickListener {
            CoroutineScope(Dispatchers.Main).launch {
                dummyDownload()

            }
        }

    }

    private suspend fun dummyDownload() {
        for (i in 1..2000) {
            withContext(Dispatchers.Main) {
                Log.i("TTT", "Downloading $i in Thread ${Thread.currentThread().name}")
                binding.tvProgress.text = "Downloading $i in Thread ${Thread.currentThread().name}"
            }

        }
    }
}