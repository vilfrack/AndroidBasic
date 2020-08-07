package com.androidfundamentals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStartService.setOnClickListener {
            Intent(this, MyIntentService::class.java).also {
                startService(it)
                tvServiceInfo.text = "Service running"
            }
        }

        btnStopService.setOnClickListener {
            MyIntentService.stopService()
            tvServiceInfo.text = "Service stopped"
        }
    }


}