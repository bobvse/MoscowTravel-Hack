package com.example.moscowtravelhack.presentation.map.di

import com.example.moscowtravelhack.core.screen.ComponentCompanion
import com.example.moscowtravelhack.di.deps.global.GlobalDependencies
import com.example.moscowtravelhack.di.deps.network.NetworkDependencies
import com.example.moscowtravelhack.di.scope.PerPresentationScope
import dagger.Component

@PerPresentationScope
@Component(
    dependencies = [
        NetworkDependencies::class,
        GlobalDependencies::class
    ]
)
interface MapComponent {
    fun inject(graph: MapGraph)

    companion object : ComponentCompanion<MapComponent>() {
        override fun createComponent(): MapComponent {
            return DaggerMapComponent.builder()
                .networkDependencies(NetworkDependencies.get())
                .globalDependencies(GlobalDependencies.get())
                .build()
        }
    }
}