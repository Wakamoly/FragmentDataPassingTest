package com.example.fragmentdatapassingtest.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.fragmentdatapassingtest.databinding.FragmentFirstBinding
import com.example.fragmentdatapassingtest.ui.MainActivity.Companion.navigateSafely

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.buttonNext.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            this.findNavController().navigateSafely(action)
        }

        return binding.root
    }

}