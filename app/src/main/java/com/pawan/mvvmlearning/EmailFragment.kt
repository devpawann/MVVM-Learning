package com.pawan.mvvmlearning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.pawan.mvvmlearning.databinding.FragmentEmailBinding

class EmailFragment : Fragment() {
    private lateinit var binding: FragmentEmailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_email, container, false)
        binding.btnEmail.setOnClickListener {
            val name = requireArguments().getString("name")
            val bundle = bundleOf(
                "name_user" to name,
                "email_user" to binding.editTextTextEmailAddress.text.toString()
            )


            it.findNavController().navigate(R.id.action_emailFragment_to_detailsFragment,bundle)
        }

        return binding.root

    }


}