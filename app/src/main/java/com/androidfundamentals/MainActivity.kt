package com.androidfundamentals

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var receiver : AirplaneModeChangedReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        receiver = AirplaneModeChangedReceiver()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(AirplaneModeChangedReceiver(), it)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }

}