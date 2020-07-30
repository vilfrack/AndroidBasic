package com.androidfundamentals

import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class Order(list:List<ModelIngredients>) {

    val OrderCheckList = list
    var finalOrder:String = ""
    fun message():String{

        for (item in OrderCheckList){
            if (item.checked == true){
                finalOrder += "\n${item.name}"
            }
        }
        return finalOrder
    }
}