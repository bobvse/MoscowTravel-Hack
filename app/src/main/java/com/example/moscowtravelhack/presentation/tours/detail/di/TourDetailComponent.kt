package com.example.moscowtravelhack.presentation.tours.detail.di

import com.example.moscowtravelhack.core.screen.ComponentCompanion
import com.example.moscowtravelhack.di.deps.global.GlobalDependencies
import com.example.moscowtravelhack.di.deps.navigation.RouterDependencies
import com.example.moscowtravelhack.di.deps.network.NetworkDependencies
import com.example.moscowtravelhack.di.scope.PerPresentationScope
import dagger.Component

@PerPresentationScope
@Component(
    dependencies = [
        NetworkDependencies::class,
        GlobalDependencies::class,
        RouterDependencies::class
    ]
)
interface TourDetailComponent {
    fun inject(graph: TourDetailGraph)

    companion object : ComponentCompanion<TourDetailComponent>() {
        override fun createComponent(): TourDetailComponent {
            return DaggerTourDetailComponent.builder()
                .networkDependencies(NetworkDependencies.get())
                .globalDependencies(GlobalDependencies.get())
                .routerDependencies(RouterDependencies.get())
                .build()
        }
    }
}