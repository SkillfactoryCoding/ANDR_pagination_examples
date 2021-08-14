package com.arrival.recyclerviewpaginationaexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.arrival.recyclerviewpaginationaexample.pahing.MainDataSourceFactory
import java.util.concurrent.Executors

class MainActivityViewModel : ViewModel() {
    private val repo = App.instance.repo
    private val mainDataSourceFactory: MainDataSourceFactory = MainDataSourceFactory(repo)
    val data: LiveData<PagedList<Int>>

    init {
        val config = PagedList.Config.Builder()
            .setEnablePlaceholders(false)
            .setPageSize(10)
            .setPrefetchDistance(2)
            .build()

        data = LivePagedListBuilder<Int, Int>(mainDataSourceFactory, config)
            .setFetchExecutor(Executors.newFixedThreadPool(3))
            .build()
    }

//    fun getDataFromApi(page: Int) {
//        val list = repo.getPage(page)
//        _data.postValue(list)
//    }
}