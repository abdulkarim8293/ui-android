package com.abdulkarim.userinterface.bkash_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.widget.Group
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abdulkarim.userinterface.R
import com.abdulkarim.userinterface.adapter.MyBkashAdapter
import com.abdulkarim.userinterface.adapter.UserInterfaceAdapter
import com.abdulkarim.userinterface.bkash_ui.fragment.HomeFragment

class HomeActivity : AppCompatActivity() {

    private lateinit var myBkashAdapter: MyBkashAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val home = findViewById<Group>(R.id.homeGroup)

        home.setOnClickListener {
            Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container,HomeFragment()).commit()

        }

        val list = ArrayList<String>()
        list.add("Title One")
        list.add("Title Two")
        list.add("Title Three")

        myBkashAdapter = MyBkashAdapter(list)
        val recyclerView = findViewById<RecyclerView>(R.id.balanceDetailsRv)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myBkashAdapter



    }
}