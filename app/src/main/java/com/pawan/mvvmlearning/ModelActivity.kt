package com.pawan.mvvmlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.pawan.mvvmlearning.databinding.ActivityModelBinding

class ModelActivity : AppCompatActivity() {
    private lateinit var binding: ActivityModelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_model)
        val student=getStudent()
        binding.tvEmail.text=student.email
        binding.tvName.text=student.name
    }

    fun getStudent(): StudentModel {
        return StudentModel("Pawan", "pawan@gmail.com")
    }
}