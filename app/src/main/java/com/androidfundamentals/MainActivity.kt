package com.androidfundamentals

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add contact")
            .setMessage("Do you want Mr. Poop to you contacts list?")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this,"You added Mr. Poop to your contact list", Toast.LENGTH_LONG).show()
            }
            .setNegativeButton("No") {_,_ ->
                Toast.makeText(this,"You didn't Mr. Poop to your contact list", Toast.LENGTH_LONG).show()
            }.create()

        btnDialogOne.setOnClickListener {
            addContactDialog.show()
        }

        val option = arrayOf("First Item", "Second Item", "Third Item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose on of these options")
            .setSingleChoiceItems(option,0) { dialog, i ->
                Toast.makeText(this,"You clicked on ${option[i]}", Toast.LENGTH_LONG).show()
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this,"You accepted the SingleChoiceDialog", Toast.LENGTH_LONG).show()
            }
            .setNegativeButton("No") {_,_ ->
                Toast.makeText(this,"You decline the SingleChoiceDialog", Toast.LENGTH_LONG).show()
            }.create()

        btnDialogTwo.setOnClickListener {
            singleChoiceDialog.show()
        }
        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose on of these options")
            .setMultiChoiceItems(option, booleanArrayOf(false,false,false)) { _, i, isChecked ->
                if (isChecked){
                    Toast.makeText(this, "You checked ${option[i]}", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "You unchecked ${option[i]}", Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this,"You accepted the MultipleChoiceDialog", Toast.LENGTH_LONG).show()
            }
            .setNegativeButton("No") {_,_ ->
                Toast.makeText(this,"You decline the MultipleChoiceDialog", Toast.LENGTH_LONG).show()
            }.create()

        btnDialogThree.setOnClickListener {
            multiChoiceDialog.show()
        }
    }


}