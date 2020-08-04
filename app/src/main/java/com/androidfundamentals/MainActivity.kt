package com.androidfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_view_pager.*
import java.util.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.kermit,
            R.drawable.kermit2,
            R.drawable.kermit3,
            R.drawable.kermit4,
            R.drawable.kermit5,
            R.drawable.kermit6
        )

        val adapter = ViewPageAdapter(images)
        viewPager.adapter = adapter

        //ESTE COMANDO PERMITE CAMBIAR LA DIRECCION DEL DESPLAZAMIENTO DE LAS IMAGENES
        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        //deja q se inicie en cualquier imagen
        viewPager.beginFakeDrag()
        viewPager.fakeDragBy(-10f)
        viewPager.endFakeDrag()

}


}