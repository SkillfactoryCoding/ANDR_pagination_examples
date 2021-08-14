package com.arrival.recyclerviewpaginationaexample.pahing

import androidx.paging.PageKeyedDataSource
import com.arrival.recyclerviewpaginationaexample.Repo

class MainDataSource(private val repo: Repo) : PageKeyedDataSource<Int, Int>() {
    override fun loadInitial(params: LoadInitialParams<Int>, callback: LoadInitialCallback<Int, Int>) {
        callback.onResult(repo.getPage(1), null, 2)
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, Int>) {

    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, Int>) {
        callback.onResult(repo.getPage(params.key), params.key + 1)
    }
}