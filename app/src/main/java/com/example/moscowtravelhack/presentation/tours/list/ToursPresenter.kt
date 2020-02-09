package com.example.moscowtravelhack.presentation.tours.list

import com.arellomobile.mvp.InjectViewState
import com.example.moscowtravelhack.core.BasePresenter
import com.example.moscowtravelhack.core.extensions.async
import com.example.moscowtravelhack.di.core.navigation.MainRouter
import com.example.moscowtravelhack.domain.GlobalInteractor
import com.example.moscowtravelhack.model.ToursListResponse
import com.example.moscowtravelhack.presentation.tours.list.adapter.TourModel
import javax.inject.Inject

@InjectViewState
class ToursPresenter
@Inject constructor(
    val globalInteractor: GlobalInteractor,
    private val mainRouter: MainRouter
) : BasePresenter<ToursView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        getToursList()
    }

    fun onDetailTourClick(item: ToursListResponse) {
        mainRouter.openDetailTourScreen()
    }

    private fun getToursList() {
        unsubscribeOnDestroy(globalInteractor.
            getToursList()
            .async()
            .subscribe({
            viewState.updateList(it)
        }, {

        }))
    }

}