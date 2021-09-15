package com.abdulkarim.userinterface.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abdulkarim.userinterface.R

class MyBkashAdapter(private val list: List<String>)  : RecyclerView.Adapter<MyBkashAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_my_bikash, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        holder.title.text = list.get(position)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val  title:TextView = itemView.findViewById(R.id.titleTv)
        val  description:TextView = itemView.findViewById(R.id.descriptionTv)
    }

}