package com.arrival.recyclerviewpaginationaexample.pahing

import androidx.paging.DataSource
import com.arrival.recyclerviewpaginationaexample.Repo

class MainDataSourceFactory(private val repo: Repo) : DataSource.Factory<Int, Int>() {
    override fun create(): DataSource<Int, Int> {
        return MainDataSource(repo = repo)
    }
}