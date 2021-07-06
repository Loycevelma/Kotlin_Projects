package com.example.fibonaccinumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var rvNumbers: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()

    }

    fun castView() {
        rvNumbers = findViewById(R.id.rvNumbers)
        rvNumbers.layoutManager = LinearLayoutManager(baseContext)
        var numAdapter = group_of_numbers((showNum(100)))
        rvNumbers.adapter = numAdapter
        showNum(10)
    }

    fun showNum(NumberList: Int): MutableList<BigInteger> {
        var count=0;
        var numone = BigInteger.ZERO
        var nextnum = BigInteger.ONE
        var numbers = mutableListOf<BigInteger>()
        numbers[0] = numone
        numbers[1] = nextnum
        while(count <= NumberList){
      println(numone)
            var sum = numone + nextnum
            numone = nextnum
            nextnum = sum
            count++
            numbers.add(numone)
        }
        return numbers
    }
}