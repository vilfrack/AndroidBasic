package com.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    var ListIngredients = mutableListOf<ModelIngredients>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOrder.setOnClickListener {
            val checkedMeatRadioButtonId = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)

            AddListIngredients()

            val orderMessage = Order(ListIngredients).message()
            Log.i("ModelIngredients", orderMessage )

            val orderString ="You ordered a burger with :\n"+
                    "${meat.text}"+ "${orderMessage}"
            tvOrder.text = orderString

        }
    }
    fun AddListIngredients(){
        ListIngredients.add(ModelIngredients().apply { checked = cbCheese.isChecked; name = cbCheese.text.toString()})
        ListIngredients.add(ModelIngredients().apply { checked = cbOnions.isChecked; name = cbOnions.text.toString()})
        ListIngredients.add(ModelIngredients().apply { checked = cbSalad.isChecked; name = cbSalad.text.toString()})
        ListIngredients.add(ModelIngredients().apply { checked = cbExtraMeat.isChecked; name = cbExtraMeat.text.toString()})
        ListIngredients.add(ModelIngredients().apply { checked = cbExtraChiken.isChecked; name = cbExtraChiken.text.toString()})
        ListIngredients.add(ModelIngredients().apply { checked = cbExtraPork.isChecked; name = cbExtraPork.text.toString()})
    }


}