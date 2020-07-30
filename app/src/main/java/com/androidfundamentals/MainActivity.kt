package com.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*
import java.util.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnShowToast.setOnClickListener {
           Toast(this).apply {
               duration = Toast.LENGTH_LONG
               view = layoutInflater.inflate(R.layout.custom_toast,clToast)
               //el segundo parametro es el id del layaout constrains del custom layout
               show()
           }
        }
    }
}