package com.arrival.recyclerviewpaginationaexample.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arrival.recyclerviewpaginationaexample.R

class MainAdapter : RecyclerView.Adapter<MainViewHolder>() {
    private val items = mutableListOf<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return  MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.onBind(items[position])
    }

    override fun getItemCount(): Int = items.size

    fun addItems(list: List<Int>) {
        items.addAll(list)
    }
}