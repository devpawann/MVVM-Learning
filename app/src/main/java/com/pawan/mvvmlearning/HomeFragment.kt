package com.pawan.mvvmlearning

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.pawan.mvvmlearning.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.btnTerms.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_termsFragment)
        }

        binding.btnSignup.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment)
        }

//        binding.btnTerms.setOnClickListener {
//            if(TextUtils.isEmpty(binding.editTextTextPersonName.text.toString())){
//                Toast.makeText(activity,"Cant be empty",Toast.LENGTH_LONG).show()
//                return@setOnClickListener
//            }
//            val bundle= bundleOf("user_data" to binding.editTextTextPersonName.text.toString())
//            it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment,bundle)
//        }

        return binding.root

    }

}