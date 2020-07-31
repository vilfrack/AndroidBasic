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

        btnOpenActivity.setOnClickListener {
            //define el intent y abre el segundo activity
            Intent(this, SecondActivity::class.java).also {
                startActivity(it)
            }
        }
    }


}