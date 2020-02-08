package com.example.moscowtravelhack.core.base

import android.app.Application
import com.example.moscowtravelhack.di.deps.context.ContextComponent
import com.example.moscowtravelhack.di.deps.context.ContextDependencies
import com.example.moscowtravelhack.di.deps.global.GlobalDependencies
import com.example.moscowtravelhack.di.deps.global.GlobalDependenciesComponent
import com.example.moscowtravelhack.di.deps.navigation.RouterDependencies
import com.example.moscowtravelhack.di.deps.navigation.RouterDependenciesComponent
import com.example.moscowtravelhack.di.deps.network.NetworkDependencies
import com.example.moscowtravelhack.di.deps.network.NetworkDependenciesComponent

object DependencyResolver {
    fun initDependencies(application: Application) {
        ContextDependencies.initProvider { ContextComponent.build(application.applicationContext) }
        RouterDependencies.initProvider { RouterDependenciesComponent.createComponent() }
        NetworkDependencies.initProvider { NetworkDependenciesComponent.createComponent() }
        GlobalDependencies.initProvider { GlobalDependenciesComponent.createComponent() }
    }
}