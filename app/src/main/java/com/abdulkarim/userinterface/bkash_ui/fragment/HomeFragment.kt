package com.abdulkarim.userinterface.bkash_ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abdulkarim.userinterface.R
import com.abdulkarim.userinterface.adapter.MyBkashAdapter


class HomeFragment : Fragment() {

    private lateinit var myBkashAdapter: MyBkashAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)



        val list = ArrayList<String>()
        list.add("Title One")
        list.add("Title Two")
        list.add("Title Three")

        myBkashAdapter = MyBkashAdapter(list)
        val recyclerView = view.findViewById<RecyclerView>(R.id.balanceDetailsRv)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.adapter = myBkashAdapter

        val recyclerView1 = view.findViewById<RecyclerView>(R.id.shongkheponRv)
        recyclerView1.setHasFixedSize(true)
        recyclerView1.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        recyclerView1.adapter = myBkashAdapter

        val recyclerView2 = view.findViewById<RecyclerView>(R.id.offerRv)
        recyclerView2.setHasFixedSize(true)
        recyclerView2.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        recyclerView2.adapter = myBkashAdapter

        return view


    }

}