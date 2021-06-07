 package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNum1 = findViewById<EditText>(R.id.etNum1)
        val etNum2 = findViewById<EditText>(R.id.etNum2)
        val btnButton = findViewById<Button>(R.id.btnAdd)
        val btnButton1 = findViewById<Button>(R.id.btnSubtract)
        val btnButton3 = findViewById<Button>(R.id.btnMultiply)
        val btnButton4 = findViewById<Button>(R.id.btnModulus)
        val tvAnswer = findViewById<TextView>(R.id.tvAnswer)

        btnButton.setOnClickListener {
            var num1 = etNum1.text.toString().toInt()
            var num2 = etNum2.text.toString().toInt()
            var Addition = num1 + num2
            tvAnswer.setText(Addition.toString())
        }

        btnButton1.setOnClickListener {
                var num1 = etNum1.text.toString().toInt()
                var num2 = etNum2.text.toString().toInt()
                var subtract = num1 - num2
                tvAnswer.setText(subtract.toString())
            }

        btnButton3.setOnClickListener {
                    var num1 = etNum1.text.toString().toInt()
                    var num2 = etNum2.text.toString().toInt()
                    var multiply = num1 * num2
                    tvAnswer.setText(multiply.toString())
                }


        btnButton4.setOnClickListener {
                        var num1 = etNum1.text.toString().toInt()
                        var num2 = etNum2.text.toString().toInt()
                        var modulus = num1 % num2
                        tvAnswer.setText(modulus.toString())


        }
    }
}



