package com.arrival.recyclerviewpaginationaexample.rv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import com.arrival.recyclerviewpaginationaexample.R
import com.arrival.recyclerviewpaginationaexample.utils.Diff

class MainAdapter : PagedListAdapter<Int, MainViewHolder>(Diff.CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return  MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val item = getItem(position) ?: return
        holder.onBind(item)
    }
}