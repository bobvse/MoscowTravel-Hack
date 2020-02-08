package com.example.moscowtravelhack.presentation.profile.di

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
interface ProfileComponent {
    fun inject(graph: ProfileGraph)

    companion object : ComponentCompanion<ProfileComponent>() {
        override fun createComponent(): ProfileComponent {
            return DaggerProfileComponent.builder()
                .networkDependencies(NetworkDependencies.get())
                .globalDependencies(GlobalDependencies.get())
                .build()
        }
    }
}