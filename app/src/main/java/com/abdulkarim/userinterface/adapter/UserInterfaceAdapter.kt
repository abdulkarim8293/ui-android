package com.abdulkarim.userinterface.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.abdulkarim.userinterface.R
import com.abdulkarim.userinterface.listener.OnItemClickListener
import com.abdulkarim.userinterface.model.ListItem

class UserInterfaceAdapter(private val userInterfaceList: List<ListItem>,private val onItemClickListener: OnItemClickListener)  : RecyclerView.Adapter<UserInterfaceAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_interface, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val listItem = userInterfaceList.get(position)
        holder.title.text = listItem.title
        holder.description.text = listItem.description
        holder.itemView.setOnClickListener {
            onItemClickListener.onItemClick(listItem)
        }
    }

    override fun getItemCount(): Int {
        return userInterfaceList.size
    }

    class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val  title:TextView = itemView.findViewById(R.id.titleTv)
        val  description:TextView = itemView.findViewById(R.id.descriptionTv)
    }

}