package com.arrival.recyclerviewpaginationaexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.recyclerview.widget.LinearLayoutManager
import com.arrival.recyclerviewpaginationaexample.databinding.ActivityMainBinding
import com.arrival.recyclerviewpaginationaexample.rv.MainAdapter

class MainActivity : AppCompatActivity() {
    private val viewModel by lazy {
        ViewModelProvider.NewInstanceFactory().create(MainActivityViewModel::class.java)
    }
    private val mainAdapter = MainAdapter()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainRv.apply {
            adapter = mainAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        viewModel.data.observe(this) {
            println("VVV from observe $it")
            mainAdapter.submitList(it)
        }
    }
}