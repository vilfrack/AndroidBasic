package com.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //con esta codigo se puede modificar el contenido del spinner
        val customList = listOf("First","Second","Third","Fourth")
        val adapter = ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item, customList)
        spMonths.adapter = adapter
        //-----------------------------------------------------------
        
        spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                //se le pasa el activity en el que se esta trabajando
                Toast.makeText(this@MainActivity, "You selected ${parent?.getItemAtPosition(position).toString()}", Toast.LENGTH_LONG).show()
            }
        }
    }


}