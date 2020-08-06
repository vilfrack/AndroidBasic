package com.androidfundamentals

import android.content.Context
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

        //estas dos lineas de codigo permite generar el guardado
        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        //esto se usa para guardar una especie de temporal para el usuario en caso de cerrar por error la ventana

        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString().toInt();
            val isAdult = cbAdult.isChecked
            editor.apply{
                putString("name", name)
                putInt("age",age)
                putBoolean("isAdult",isAdult)
                apply()
            }
        }
        btnLoad.setOnClickListener {
            val name = sharedPref.getString("name",null)
            val age = sharedPref.getInt("age",0)
            val isAdult = sharedPref.getBoolean("isAdult",false)

            etName.setText(name)
            etAge.setText(age.toString())
            cbAdult.isChecked = isAdult
        }
    }


}