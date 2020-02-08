package com.example.moscowtravelhack.di.core.navigation

import com.example.moscowtravelhack.presentation.map.MapFragment
import com.example.moscowtravelhack.presentation.profile.ProfileFragment
import com.example.moscowtravelhack.presentation.tours.ToursFragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

object Screens {

    object MapScreen : SupportAppScreen() {
        override fun getFragment() = MapFragment.newInstance()
    }

    object ToursScreen : SupportAppScreen() {
        override fun getFragment() = ToursFragment.newInstance()
    }

    object ProfileScreen : SupportAppScreen() {
        override fun getFragment() = ProfileFragment.newInstance()
    }
}