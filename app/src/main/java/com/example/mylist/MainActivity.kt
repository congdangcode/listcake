package com.example.mylist

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rc: RecyclerView
    lateinit var data: MutableList<ItemInfor>
    lateinit var myAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rc =findViewById(R.id.rc_main)
        data = mutableListOf<ItemInfor>(
            ItemInfor(R.drawable.cake1, "chiffon", false),
            ItemInfor(R.drawable.cake1, "honey", false),
            ItemInfor(R.drawable.cake1, "choco", false),
            ItemInfor(R.drawable.cake1, "donut", false),
            ItemInfor(R.drawable.cake1, "cupcake", false),
        )
        myAdapter = MyAdapter(data)
        rc.layoutManager = LinearLayoutManager(this)
        rc.adapter = myAdapter
    }
}