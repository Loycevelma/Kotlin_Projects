
package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Food : AppCompatActivity() {
    lateinit var btnNext2: Button
    lateinit var btnBack1: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView3()
        clickNow3()
    }


    fun castView3() {
        btnNext2 = findViewById(R.id.btnNext2)
        btnBack1 = findViewById(R.id.btnBack1)
    }

    fun clickNow3() {
        btnNext2.setOnClickListener {
            val next = Intent(baseContext, Health::class.java)
            startActivity(next)

        }
        btnBack1.setOnClickListener {
            val back = Intent(baseContext, Personality::class.java)
            startActivity(back)
        }
    }
}