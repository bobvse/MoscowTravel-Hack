package com.example.moscowtravelhack.presentation.main.di

import com.example.moscowtravelhack.core.base.BaseGraph
import com.example.moscowtravelhack.presentation.main.MainPresenter
import javax.inject.Inject

class MainGraph : BaseGraph<MainComponent>(MainComponent.Companion) {

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun inject(component: MainComponent) {
        component.inject(this)
    }
}