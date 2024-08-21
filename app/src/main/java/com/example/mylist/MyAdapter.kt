package com.example.mylist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter

class MyAdapter(var list: MutableList<ItemInfor>) : Adapter<MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val itemData = list.get(position)
        holder.imageView.setImageResource(itemData.image)
        holder.textView.setText(itemData.name)
        holder.checkBox.isChecked = itemData.state
    }
}