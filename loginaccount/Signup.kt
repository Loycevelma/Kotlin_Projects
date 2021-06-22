package com.example.loginaccount

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Signup : AppCompatActivity() {
    lateinit var btnLOGIN: Button
    lateinit var etNAME: EditText
    lateinit var spGENDER: Spinner
    lateinit var etEMAIL1: EditText
    lateinit var etPHONE: EditText
    lateinit var etPASSWORD1: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        castView2()
        onclick2()

    }
    fun castView2 (){
        btnLOGIN=findViewById(R.id.btnLOGIN)
        etEMAIL1=findViewById(R.id.etEMAIL1)
        etNAME=findViewById(R.id.etNAME)
        etPHONE=findViewById(R.id.etPHONE)
        etPASSWORD1=findViewById(R.id.etPASSWORD1)
        spGENDER=findViewById(R.id.spGENDER)
        var  Gender= arrayListOf("select Gender","Male","Female")
        var  GenderAdaptor= ArrayAdapter<String>(baseContext,android.R.layout.simple_spinner_item,Gender)
        GenderAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spGENDER.adapter=GenderAdaptor
    }
    fun onclick2(){
        var name=etNAME.text.toString()
        if (name.isEmpty()){
            etNAME.setError("Name required")
        }
        var Gender=""
        if (spGENDER.selectedItemPosition!=0){
            Gender=spGENDER.selectedItem.toString()
        }
        else{
            Toast.makeText(baseContext,"select gender", Toast.LENGTH_LONG)
        }
        var  email=etEMAIL1.text.toString()
        if (email.isEmpty()){
            etEMAIL1.setError("Email required")
        }
        var phone=etPHONE.text.toString()
        if (phone.isEmpty()){
            etPHONE.setError("Phone required")
        }
        var  password=etPASSWORD1.text.toString()
        if (password.isEmpty()){
            etPASSWORD1.setError("Paswword required")
        }
        val  init= Intent(baseContext,MainActivity::class.java)
        startActivity(init)

    }
}