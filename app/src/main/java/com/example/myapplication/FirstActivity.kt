package com.example.myapplication

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("ONCREATE")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ACTIVITY1", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.d("ACTIVITY1", "onResume")

    }

    override fun onPause() {
        super.onPause()

    }

    override fun onStop() {
        super.onStop()
        log("onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("onDestroy")

    }

    fun log(str: String) {
        Log.d("ACTIVITY1", str)
    }
}