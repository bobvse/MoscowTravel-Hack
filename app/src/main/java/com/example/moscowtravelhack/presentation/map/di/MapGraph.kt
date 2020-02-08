package com.example.moscowtravelhack.presentation.map.di

import com.example.moscowtravelhack.core.base.BaseGraph
import com.example.moscowtravelhack.presentation.map.MapPresenter
import javax.inject.Inject

class MapGraph : BaseGraph<MapComponent>(MapComponent.Companion) {

    @Inject
    lateinit var mapPresenter: MapPresenter

    override fun inject(component: MapComponent) {
        component.inject(this)
    }
}