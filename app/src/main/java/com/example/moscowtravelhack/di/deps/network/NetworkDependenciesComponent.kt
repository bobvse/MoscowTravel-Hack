package com.example.moscowtravelhack.di.deps.network

import com.example.moscowtravelhack.core.screen.ComponentCompanion
import com.example.moscowtravelhack.di.deps.context.ContextDependencies
import com.example.moscowtravelhack.di.scope.ApplicationScope
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        RetrofitModule::class
    ],
    dependencies = [
        ContextDependencies::class
    ]
)
interface NetworkDependenciesComponent : NetworkDependencies {
    companion object : ComponentCompanion<NetworkDependenciesComponent>() {
        override fun createComponent(): NetworkDependenciesComponent {
            return DaggerNetworkDependenciesComponent.builder()
                .contextDependencies(ContextDependencies.get())
                .build()
        }
    }
}