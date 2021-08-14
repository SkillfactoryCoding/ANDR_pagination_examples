package com.arrival.recyclerviewpaginationaexample.utils

import androidx.recyclerview.widget.DiffUtil


object Diff {
    val CALLBACK: DiffUtil.ItemCallback<Int> = object : DiffUtil.ItemCallback<Int>() {
        override fun areItemsTheSame(num1: Int, num2: Int): Boolean {
            return num1 == num2
        }

        override fun areContentsTheSame(num1: Int, num2: Int): Boolean {
            return true
        }
    }
}