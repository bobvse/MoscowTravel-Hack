package com.example.moscowtravelhack

import android.app.Application
import com.example.moscowtravelhack.core.base.DependencyResolver

class App : Application(){

    override fun onCreate() {
        super.onCreate()


        //инит зависимостей
        DependencyResolver.initDependencies(this)
    }
}