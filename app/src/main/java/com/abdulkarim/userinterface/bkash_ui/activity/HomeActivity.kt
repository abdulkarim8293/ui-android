package com.abdulkarim.userinterface.bkash_ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.constraintlayout.widget.Group
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abdulkarim.userinterface.R
import com.abdulkarim.userinterface.adapter.MyBkashAdapter
import com.abdulkarim.userinterface.adapter.UserInterfaceAdapter
import com.abdulkarim.userinterface.bkash_ui.fragment.HomeFragment
import com.abdulkarim.userinterface.bkash_ui.fragment.InboxFragment

class HomeActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        loadFragment(HomeFragment())

        val home = findViewById<Group>(R.id.homeGroup)
        val inbox = findViewById<Group>(R.id.inboxGroup)

        home.setOnClickListener {
            loadFragment(HomeFragment())
        }

        inbox.setOnClickListener {
            loadFragment(InboxFragment())
        }

    }

    private fun loadFragment(fragment:Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit()
    }
}