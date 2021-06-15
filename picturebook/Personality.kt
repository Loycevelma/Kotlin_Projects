package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Personality : AppCompatActivity() {
    lateinit var btnNext1: Button
    lateinit var btnBack: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        castView2()
        clickNow2()
    }


    fun castView2() {
        btnNext1 = findViewById(R.id.btnNext1)
        btnBack = findViewById(R.id.btnBack)
    }

    fun clickNow2() {
        btnNext1.setOnClickListener {
            val next = Intent(baseContext, Food::class.java)
            startActivity(next)

        }
        btnBack.setOnClickListener {
            val back = Intent(baseContext, MainActivity::class.java)
            startActivity(back)
        }
    }
}