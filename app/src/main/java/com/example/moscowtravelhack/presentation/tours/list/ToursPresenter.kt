package com.example.moscowtravelhack.presentation.tours.list

import com.arellomobile.mvp.InjectViewState
import com.example.moscowtravelhack.core.BasePresenter
import com.example.moscowtravelhack.di.core.navigation.MainRouter
import com.example.moscowtravelhack.domain.GlobalInteractor
import com.example.moscowtravelhack.presentation.tours.list.adapter.TourModel
import javax.inject.Inject

@InjectViewState
class ToursPresenter
@Inject constructor(
    val globalInteractor: GlobalInteractor,
    private val mainRouter: MainRouter
) : BasePresenter<ToursView>() {

    fun onDetailTourClick(item: TourModel) {
        mainRouter.openDetailTourScreen()
    }

}