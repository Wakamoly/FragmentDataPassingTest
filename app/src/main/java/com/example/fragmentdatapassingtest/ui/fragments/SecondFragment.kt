package com.example.fragmentdatapassingtest.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragmentdatapassingtest.R
import com.example.fragmentdatapassingtest.databinding.FragmentFirstBinding
import com.example.fragmentdatapassingtest.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.buttonPrevious.setOnClickListener {
            this.findNavController().navigateUp()
        }

        return binding.root
    }

}