package com.example.notees.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notees.R
import com.example.notees.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    private  lateinit var homeBinding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeBinding =  ActivityHomeBinding.inflate(layoutInflater)

        setContentView(homeBinding.root)
    }
}