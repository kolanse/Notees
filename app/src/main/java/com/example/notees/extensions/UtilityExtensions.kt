package com.example.notees.extensions

import android.os.Build
import android.util.Log
import androidx.fragment.app.Fragment
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*


fun Fragment.generateTime():String{
    var answer = ""
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy. HH:mm:ss")
        answer =  current.format(formatter)
        Log.d("answer",answer)
    } else {
        var date = Date()
        val formatter = SimpleDateFormat("MMM dd yyyy HH:mma")
         answer= formatter.format(date)
        Log.d("answer",answer)
    }

    return answer
}