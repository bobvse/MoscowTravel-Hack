package com.example.moscowtravelhack.presentation.tours.detail.di

import com.example.moscowtravelhack.core.base.BaseGraph
import com.example.moscowtravelhack.presentation.tours.detail.TourDetailPresenter
import javax.inject.Inject

class TourDetailGraph : BaseGraph<TourDetailComponent>(TourDetailComponent.Companion) {

    @Inject
    lateinit var toursDetailPresenter: TourDetailPresenter

    override fun inject(component: TourDetailComponent) {
        component.inject(this)
    }
}