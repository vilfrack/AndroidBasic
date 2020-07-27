package com.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf(5,2,8,6,3)
        sortList(list)
        Log.d("MainActivity","Hello this is my firts log msg ")
        println(list)
    }
    private fun sortList(list:List<Int>){
        for (i in 0..list.size -1){
            for (j in 0..list.size -2){
                if (list[j] > list[j+1]){
                    Collections.swap(list,j,j+1)
                }
            }
        }
    }


}