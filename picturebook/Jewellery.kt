package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Jewellery : AppCompatActivity() {
    lateinit var btnBack3: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView5()
        clickNow5()
    }



    fun castView5() {
        btnBack3 = findViewById(R.id.btnBack3)
    }

    fun clickNow5() {
        btnBack3.setOnClickListener {
            val back = Intent(baseContext , MainActivity::class.java)
            startActivity(back)
        }
    }
}