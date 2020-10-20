package com.example.notees.navigation

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


interface AppNavigator {


    /**
     * Go to a activity
     */
    fun goToActvity(activityToGo: Class<out AppCompatActivity>)

    /**
     * Go to Fragment
     */

    fun goToFragment(fragmentToGo: Int, frag:Fragment)
}