package com.pawan.mvvmlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.pawan.mvvmlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)




        binding.start.setOnClickListener {
            startService(Intent(this, MusicService::class.java))
        }

        binding.stop.setOnClickListener {
            stopService(Intent(this, MusicService::class.java))
        }

    }


}