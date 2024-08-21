package com.example.mylist

import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyHolder(itemView: View) : ViewHolder(itemView) {
    var imageView = itemView.findViewById<ImageView>(R.id.iv_item)
    var textView = itemView.findViewById<TextView>(R.id.tv_item)
    var checkBox = itemView.findViewById<CheckBox>(R.id.ck_item)
}