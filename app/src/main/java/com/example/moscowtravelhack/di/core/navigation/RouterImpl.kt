package com.example.moscowtravelhack.di.core.navigation

import ru.terrakok.cicerone.Router

class RouterImpl : Router(), MainRouter {

    override fun openMapScreen() {
        navigateTo(Screens.MapScreen)
    }

    override fun openProfileScreen() {
        navigateTo(Screens.ProfileScreen)
    }

    override fun openToursScreen() {
        navigateTo(Screens.ToursScreen)
    }

    override fun goBack() = exit()
}