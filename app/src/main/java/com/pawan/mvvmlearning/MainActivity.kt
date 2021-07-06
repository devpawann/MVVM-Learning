package com.pawan.mvvmlearning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.pawan.mvvmlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnSubmit.setOnClickListener {
            val name:String=binding.etName.text.toString()
            binding.tvGreeting.text="Hello $name"
        }
        binding.btnGotoNext.setOnClickListener {
            val intent:Intent=Intent(this,SpinnerActivity::class.java)
            startActivity(intent)
        }
        binding.btnGotoModel.setOnClickListener {
            val intent:Intent=Intent(this,ModelActivity::class.java)
            startActivity(intent)
        }

    }
}