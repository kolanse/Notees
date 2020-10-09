package com.example.notees.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notees.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}