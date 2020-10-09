package com.example.notees.navigation

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.qualifiers.ActivityContext
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


}