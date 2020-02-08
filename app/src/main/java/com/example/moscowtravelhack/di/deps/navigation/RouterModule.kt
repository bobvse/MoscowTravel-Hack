package com.example.moscowtravelhack.di.deps.navigation

import com.example.moscowtravelhack.di.core.navigation.MainRouter
import com.example.moscowtravelhack.di.core.navigation.RouterImpl
import com.example.moscowtravelhack.di.scope.ApplicationScope

import dagger.Module
import dagger.Provides
import ru.terrakok.cicerone.Cicerone

@Module
class RouterModule {

    private val mainRouter = RouterImpl()

    private val cicerone = Cicerone.create(mainRouter)

    private val holder = cicerone.navigatorHolder

    @Provides
    @ApplicationScope
    fun provideNavigatorHolder() = holder

    @Provides
    @ApplicationScope
    fun provideMainRouter(): MainRouter = mainRouter
}