package com.example.moscowtravelhack.presentation.tours.list

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.example.moscowtravelhack.model.ToursListResponse

@StateStrategyType(OneExecutionStateStrategy::class)
interface ToursView : MvpView {
    fun updateList(items: List<ToursListResponse>)
}