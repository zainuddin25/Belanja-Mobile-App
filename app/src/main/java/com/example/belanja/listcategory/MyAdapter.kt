package com.example.belanja.listcategory

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belanja.R

class MyAdapter(private val listCategory: ArrayList<ListItem>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.category_list, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val curentItem = listCategory[position]
        holder.iconCategory.setImageResource(curentItem.image)
        holder.titleCategory.text = curentItem.title
    }

    override fun getItemCount(): Int {
        return listCategory.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val iconCategory: ImageView = itemView.findViewById(R.id.icon_category)
        val titleCategory: TextView = itemView.findViewById(R.id.tv_categoryList)
    }

}