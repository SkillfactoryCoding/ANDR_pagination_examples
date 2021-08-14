package com.arrival.recyclerviewpaginationaexample.rv

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.arrival.recyclerviewpaginationaexample.databinding.ItemBinding

class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val binding = ItemBinding.bind(itemView)

    fun onBind(int: Int) {
        binding.number.text = int.toString()
    }
}