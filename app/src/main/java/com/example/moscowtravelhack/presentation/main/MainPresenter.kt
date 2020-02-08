package com.example.moscowtravelhack.presentation.main

import com.arellomobile.mvp.InjectViewState
import com.example.moscowtravelhack.core.BasePresenter
import com.example.moscowtravelhack.di.core.navigation.MainRouter

import ru.terrakok.cicerone.Navigator
import ru.terrakok.cicerone.NavigatorHolder
import javax.inject.Inject

@InjectViewState
class MainPresenter
@Inject constructor(
    private val mainRouter: MainRouter,
    private val navigatorHolder: NavigatorHolder
) : BasePresenter<MainView>() {

    fun init() {
        openMapScreen()
    }

    fun openMapScreen() {
        mainRouter.openMapScreen()
    }

    fun openToursScreen() {
        mainRouter.openToursScreen()
    }

    fun openProfileScreen() {
        mainRouter.openProfileScreen()
    }

    fun setNavigator(navigator: Navigator) {
        navigatorHolder.setNavigator(navigator)
    }

    fun removeNavigator() {
        navigatorHolder.removeNavigator()
    }
}