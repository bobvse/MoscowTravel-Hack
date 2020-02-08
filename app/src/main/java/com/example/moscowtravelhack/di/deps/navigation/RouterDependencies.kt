package com.example.moscowtravelhack.di.deps.navigation

import com.example.moscowtravelhack.core.base.SingletonWithProvider
import com.example.moscowtravelhack.di.core.navigation.MainRouter
import ru.terrakok.cicerone.NavigatorHolder

interface RouterDependencies {
    fun provideMainRouter(): MainRouter
    fun provideNavigatorHolder(): NavigatorHolder

    companion object : SingletonWithProvider<RouterDependencies>()
}