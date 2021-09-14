package com.abdulkarim.userinterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abdulkarim.userinterface.adapter.UserInterfaceAdapter
import com.abdulkarim.userinterface.model.ListItem

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var userInterfaceAdapter: UserInterfaceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listItem = ArrayList<ListItem>()
        listItem.add(ListItem("User Registration One","There are two page sign up and sing in page"))

        recyclerView = findViewById(R.id.recyclerView)
        userInterfaceAdapter = UserInterfaceAdapter(listItem)
        recyclerView.adapter = userInterfaceAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)



    }

}