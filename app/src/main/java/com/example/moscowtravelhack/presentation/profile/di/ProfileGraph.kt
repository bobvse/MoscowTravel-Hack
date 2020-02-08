package com.example.moscowtravelhack.presentation.profile.di

import com.example.moscowtravelhack.core.base.BaseGraph
import com.example.moscowtravelhack.presentation.profile.ProfilePresenter
import javax.inject.Inject

class ProfileGraph : BaseGraph<ProfileComponent>(ProfileComponent.Companion) {

    @Inject
    lateinit var proilePresenter: ProfilePresenter

    override fun inject(component: ProfileComponent) {
        component.inject(this)
    }
}