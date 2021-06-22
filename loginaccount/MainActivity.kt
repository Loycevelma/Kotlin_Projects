package com.example.loginaccount

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var btnSIGNUP: Button
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        castview1()
        onclick1()


    }
    fun castview1(){
        btnSIGNUP=findViewById(R.id.btnSIGNUP)
        var email=etEmail.text.toString()
        if (email.isEmpty()){
            etEmail.setError("Email required")
        }
        var  password=etPassword.text.toString()
        if (password.isEmpty()){
            etPassword.setError("Password required")
        }
        etEmail=findViewById(R.id.etEmail)
        etPassword=findViewById(R.id.etPASSWORD1)
    }
    fun onclick1(){
        btnSIGNUP.setOnClickListener {
            val init=Intent(baseContext,btnSIGNUP::class.java)
            startActivity(init)

        }
    }
}
