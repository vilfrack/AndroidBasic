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

        btnApply.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString().toInt()
            val country = etCountry.text.toString()
            //call another  and send values
            val person = Person(name,age,country)
//CON LA CLASE PERSON PUEDO ENVIAR UNA N CANTIDAD DE VALORES AL OTRO ACTIVITY, SIN ESTAR CREANDO PUTEXTRA POR CADA UNO
            Intent(this,SecondActivity::class.java).also {
               it.putExtra("EXTRA_PERSON", person)
                startActivity(it)
            }
//COMO ESTABA ANTERIORMENTE,
//            Intent(this,SecondActivity::class.java).also {
//                it.putExtra("EXTRA_NAME",name)
//                it.putExtra("EXTRA_AGE",age)
//                it.putExtra("EXTRA_COUNTRY",country)
//                startActivity(it)
//            }
        }
    }


}