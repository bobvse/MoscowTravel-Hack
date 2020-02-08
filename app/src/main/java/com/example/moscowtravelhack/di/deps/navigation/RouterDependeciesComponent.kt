package com.example.moscowtravelhack.di.deps.navigation

import com.example.moscowtravelhack.core.screen.ComponentCompanion
import com.example.moscowtravelhack.di.scope.ApplicationScope
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        RouterModule::class
    ]
)
interface RouterDependenciesComponent : RouterDependencies {
    companion object : ComponentCompanion<RouterDependenciesComponent>() {
        override fun createComponent(): RouterDependenciesComponent {
            return DaggerRouterDependenciesComponent.builder()
                .build()
        }
    }
}