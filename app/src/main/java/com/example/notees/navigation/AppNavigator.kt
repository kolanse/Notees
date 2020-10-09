package com.example.notees.navigation

import androidx.appcompat.app.AppCompatActivity


interface AppNavigator {


    /**
     * Go to a activity
     */
    fun goToActvity(activityToGo: Class<out AppCompatActivity>)
}