package com.example.moscowtravelhack.presentation.tours.di

import com.example.moscowtravelhack.core.base.BaseGraph
import com.example.moscowtravelhack.presentation.tours.ToursPresenter
import javax.inject.Inject

class ToursGraph : BaseGraph<ToursComponent>(ToursComponent.Companion) {

    @Inject
    lateinit var toursPresenter: ToursPresenter

    override fun inject(component: ToursComponent) {
        component.inject(this)
    }
}