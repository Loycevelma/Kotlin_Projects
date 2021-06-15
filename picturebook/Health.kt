package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Health : AppCompatActivity() {
    lateinit var btnNext3: Button
    lateinit var btnBack2: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        castView4()
        clickNow4()
    }


    fun castView4() {
        btnNext3 = findViewById(R.id.btnNext3)
        btnBack2= findViewById(R.id.btnBack2)
    }

    fun clickNow4() {
        btnNext3.setOnClickListener {
            val next = Intent(baseContext, Jewellery::class.java)
            startActivity(next)

        }
        btnBack2.setOnClickListener {
            val back = Intent(baseContext, Food::class.java)
            startActivity(back)
        }
    }
}