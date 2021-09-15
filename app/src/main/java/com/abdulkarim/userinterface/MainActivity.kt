package com.abdulkarim.userinterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.abdulkarim.userinterface.adapter.UserInterfaceAdapter
import com.abdulkarim.userinterface.constant.AppConstant
import com.abdulkarim.userinterface.listener.OnItemClickListener
import com.abdulkarim.userinterface.model.ListItem
import com.abdulkarim.userinterface.user_interface.ui_1.Login1Activity
import com.abdulkarim.userinterface.user_interface.ui_2.Login2Activity
import com.abdulkarim.userinterface.user_interface.ui_3.SignUpActivity

class MainActivity : AppCompatActivity(),OnItemClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var userInterfaceAdapter: UserInterfaceAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = "User Interface"

        val listItem = ArrayList<ListItem>()
        listItem.add(ListItem(AppConstant.LOGIN_PAGE_1,"Two edit text and one button.Button are customize"))
        listItem.add(ListItem(AppConstant.LOGIN_PAGE_2,"There are two page sign up and sing in page"))
        listItem.add(ListItem(AppConstant.LOGIN_PAGE_3,"There are two page sign up and sing in page"))

        recyclerView = findViewById(R.id.recyclerView)
        userInterfaceAdapter = UserInterfaceAdapter(listItem,this)
        recyclerView.adapter = userInterfaceAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)


    }

    override fun onItemClick(listItem: ListItem) {

        when(listItem.title){
            AppConstant.LOGIN_PAGE_1 ->{
                startActivity(Intent(this, Login1Activity::class.java))
            }
            AppConstant.LOGIN_PAGE_2 ->{
                startActivity(Intent(this, Login2Activity::class.java))
            }
            AppConstant.LOGIN_PAGE_3 ->{
                startActivity(Intent(this, SignUpActivity::class.java))
            }

        }

    }

}