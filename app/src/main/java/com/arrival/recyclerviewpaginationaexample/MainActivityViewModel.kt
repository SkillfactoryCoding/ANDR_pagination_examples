package com.arrival.recyclerviewpaginationaexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private val repo = App.instance.repo
    private val _data = MutableLiveData<List<Int>>()
    val data: LiveData<List<Int>>
        get() = _data

    fun getDataFromApi(page: Int) {
        val list = repo.getPage(page)
        _data.postValue(list)
    }
}