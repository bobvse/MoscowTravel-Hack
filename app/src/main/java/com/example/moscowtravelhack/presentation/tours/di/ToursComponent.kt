package com.example.moscowtravelhack.presentation.tours.di

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
interface ToursComponent {
    fun inject(graph: ToursGraph)

    companion object : ComponentCompanion<ToursComponent>() {
        override fun createComponent(): ToursComponent {
            return DaggerToursComponent.builder()
                .networkDependencies(NetworkDependencies.get())
                .globalDependencies(GlobalDependencies.get())
                .build()
        }
    }
}