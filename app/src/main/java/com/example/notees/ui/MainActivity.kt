package com.example.notees.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notees.R
import com.example.notees.navigation.AppNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/***
 *  SPLASH SCREEN ACTIVITY
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var navigator: AppNavigator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        /**
         * Navigate to the Home activity
         */

        navigator.goToActvity(HomeActivity::class.java)
        finish()



    }
}