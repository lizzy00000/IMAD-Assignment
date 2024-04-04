package com.example.thehistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val etAge = findViewById<EditText>(R.id.etAge).text
        // etAge = "28"
        val btnGenerateHistory = findViewById<Button>(R.id.btnGenerateHistory)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val tvResult = findViewById<TextView>(R.id.tvResult)


        btnGenerateHistory.setOnClickListener {
            val age = etAge.toString().toInt()
            //age = 28
            var message: String = ""

            if(age > 20 && age < 100){
                //I will test for ages
                when (age) {
                    95 -> message = "Your age is 95 years old,\n which is the same age as Nelson Mandela.\n" +
                            "Nelson Mandela was a famous historical figure."
                    55 -> message = "You are $age years old,\n which is the same age as William Shakespear.\n"+
                            "William Shakespear was a poet, playwright, and actor."
                    39 -> message= "You are $age years old,\n which is the same age as Martin Luther King Jr.\n" +
                            "Martin Luther King was Known for his contributions to the American civil rights movement."
                    92 -> message = "You are $age years old,\n which is the same as Rosa Parks.\n" +
                            "Rosa Parks was the mother of civil rights movement."
                    66 -> message = "You are $age years old,\n which is the same age as Marie Curie.\n" +
                            "Marie Curie discovered radium and polonium and she contributed in finding treatments for cancer."
                    56 -> message = "You are $age years old,\n which is the same age as Abraham Lincoln.\n" +
                            "Abraham Lincoln was known for preserving the Union during the American Civil War."
                    36 -> message = "You are $age years old,\n which is the same age as Princess Diana.\n" +
                            "Princess Diana was known for her charitable work."
                    76 -> message = "You are $age years old,\n which is the same age as Albert Einstein.\n" +
                            "Albert Einstein was known for his theory of general relativity."
                    78 -> message = "You are $age years old,\n which is the same age as Mahatma Gandhi.\n" +
                            "Mahatma Gandhi was known for his philosophy of nonviolence that inspired civil rights leaders around the world."
                    67 -> message = "You are $age years old,\n which is the same age as George Washington.\n" +
                            "George Washington was the first American president, commander of the Continental Army, president of the Constitutional Convention and farmer."
                    else -> message =" The age is out of range"
                }
            } else {
                message = "There is no historical figure known to be around $age years old."
            }


            tvResult.text= "${message}"
        }
        btnClear.setOnClickListener {
            etAge.clear()
            tvResult.text = ""
        }

        }
    }








