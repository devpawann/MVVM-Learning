package com.pawan.mvvmlearning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.pawan.mvvmlearning.databinding.FragmentDetailsBinding


class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false)

        val name = requireArguments().getString("name_user")
        val email = requireArguments().getString("email_user")

        binding.etEmailDetail.text = email
        binding.etNameDetail.text = name

        binding.btnTerm.setOnClickListener {
            it.findNavController().navigate(R.id.action_detailsFragment_to_termsFragment)
        }

        return binding.root
    }


}