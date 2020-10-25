package com.example.notees.extensions

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment


/**
 * animate increase and decrease size
 **/

fun Fragment.animateMovement(view: View){


    var ss = this

    val rotate = ObjectAnimator.ofFloat(
        view,
        "rotation",
        0f,
        20f,
        0f,
        -20f,
        0f
    ) // rotate o degree then 20 degree and so on for one loop of rotation.

// animateView (View object)
    // animateView (View object)
    rotate.repeatCount = 20 // repeat the loop 20 times

    rotate.duration = 700 // animation play time 100 ms

    rotate.start()

}