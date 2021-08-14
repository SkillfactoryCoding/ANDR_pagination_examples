package com.arrival.recyclerviewpaginationaexample

import android.app.Application

class App : Application() {
    val repo = Repo()

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: App
            private set
    }
}