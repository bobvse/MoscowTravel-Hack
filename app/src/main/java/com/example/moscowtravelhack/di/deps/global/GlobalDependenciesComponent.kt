package com.example.moscowtravelhack.di.deps.global

import com.example.moscowtravelhack.core.screen.ComponentCompanion
import com.example.moscowtravelhack.di.deps.network.NetworkDependencies
import com.example.moscowtravelhack.di.scope.PerPresentationScope
import dagger.Component

@PerPresentationScope
@Component(
    modules = [
        GlobalDataModule::class,
        GlobalDomainModule::class
    ], dependencies = [
        NetworkDependencies::class
    ]
)
interface GlobalDependenciesComponent : GlobalDependencies {

    companion object : ComponentCompanion<GlobalDependenciesComponent>() {
        override fun createComponent(): GlobalDependenciesComponent {
            return DaggerGlobalDependenciesComponent.builder()
                .networkDependencies(NetworkDependencies.get())
                .build()
        }
    }

}