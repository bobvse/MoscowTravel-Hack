package com.example.moscowtravelhack.presentation.main.di

import com.example.moscowtravelhack.core.screen.ComponentCompanion
import com.example.moscowtravelhack.di.deps.navigation.RouterDependencies
import com.example.moscowtravelhack.di.scope.PerPresentationScope
import dagger.Component

@PerPresentationScope
@Component(
    dependencies = [
       RouterDependencies::class
    ]
)
interface MainComponent {

    fun inject(mainGraph: MainGraph)

    companion object : ComponentCompanion<MainComponent>() {
        override fun createComponent(): MainComponent {
            return DaggerMainComponent.builder()
                .routerDependencies(RouterDependencies.get())
                .build()
        }
    }
}