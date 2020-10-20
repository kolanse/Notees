package com.example.notees.navigation

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject

class AppNavigatorImpl @Inject constructor(@ActivityContext private var context: Context): AppNavigator {


    /**
     * To Go to an activity
     */
    override fun goToActvity(activityToGo: Class<out AppCompatActivity>) {


        var intent = Intent(context, activityToGo )

        //starts the necessary activity
        context.startActivity(intent)
    }


      override fun goToFragment(fragmentToGo: Int, frag:Fragment) {


        frag.findNavController().navigate(fragmentToGo)

    }


}