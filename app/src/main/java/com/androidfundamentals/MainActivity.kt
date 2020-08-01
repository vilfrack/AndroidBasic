package com.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firtsFragment = FirtsFragment()
        val SecondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firtsFragment)
            commit()
        }

        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firtsFragment)
                addToBackStack(null)//PERMITE NO CERRAR LA APLICACION CUANDO SE HACE CLICK EN LA FLECHA DE ATRAS
                commit()
            }
        }
        btnFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, SecondFragment)
                addToBackStack(null)//PERMITE NO CERRAR LA APLICACION CUANDO SE HACE CLICK EN LA FLECHA DE ATRAS
                commit()
            }
        }
    }


}