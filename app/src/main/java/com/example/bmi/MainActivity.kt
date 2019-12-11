package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var editTextWeight : EditText
    lateinit var editTextHeight : EditText
    lateinit var textViewBMI : TextView
    lateinit var imageViewProfile : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCalculate = findViewById(R.id.buttonCalculate) as Button

        buttonCalculate.setOnClickListener {

            editTextHeight = findViewById(R.id.editTextHeight)
            editTextWeight = findViewById(R.id.editTextWeight)

            val weight:Double = editTextWeight.text.toString().toDouble()
            val height:Double = editTextHeight.text.toString().toDouble()

            val bmi:Double = weight / ((height / 1000)* (height / 1000))

            if( bmi < 0 ) {
                //imageViewProfile.setImageResource(R.drawable.empty)
            }else if(bmi < 18.5){

                //imageViewProfile.setImageResource(R.drawable.under)
            }else if (bmi > 25){

                //imageViewProfile.setImageResource(R.drawable.over)
            }else{

                //imageViewProfile.setImageResource(R.drawable.normal)
            }

            textViewBMI.setText()
        }
    }
}