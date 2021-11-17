package com.example.fragmentdatapassingtest.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import com.example.fragmentdatapassingtest.databinding.ActivityMainBinding
import com.example.fragmentdatapassingtest.viewmodels.DataViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: DataViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    companion object {
        fun NavController.navigateSafely(directions: NavDirections) {
            try { this.navigate(directions) }
            catch (err: Exception) {
                Log.d("MainActivity", "navigateSafely: ${err.localizedMessage}")
            }
        }
    }

}