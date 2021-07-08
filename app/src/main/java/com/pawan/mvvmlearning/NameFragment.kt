package com.pawan.mvvmlearning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.pawan.mvvmlearning.databinding.FragmentSecondBinding

class NameFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)

        binding.button.setOnClickListener {
            val name= bundleOf("name" to binding.etName.text.toString())
            it.findNavController().navigate(R.id.action_secondFragment_to_emailFragment,name)
        }



        return binding.root
    }

}