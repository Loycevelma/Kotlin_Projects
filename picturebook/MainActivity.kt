package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        castView1()
        clickNow1()
    }
    fun castView1 (){
        btnNext=findViewById(R.id.btnNext)

    }
    fun clickNow1 (){
        btnNext.setOnClickListener{
            val next=Intent(baseContext,Personality::class.java)
            startActivity(next)

        }
    }
}

