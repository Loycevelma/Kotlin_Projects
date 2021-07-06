package com.example.fibonaccinumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class group_of_numbers (var NumberList:MutableList<BigInteger> ):RecyclerView.Adapter<group_of_numbers.NumberViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup,viewType:Int):NumberViewHolder {
        var  itemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_group_of_numbers,parent,false)
        return NumberViewHolder(itemView)
    }
    override fun onBindViewHolder( holder:NumberViewHolder,position:Int) {

         holder.tvNumber.text=NumberList.get(position).toString()
    }
    override  fun getItemCount():Int{
        return NumberList.size
    }
    class NumberViewHolder (itemView:View) :RecyclerView.ViewHolder(itemView){
        var tvNumber=itemView.findViewById<TextView>(R.id.tvNumber)
    }

}