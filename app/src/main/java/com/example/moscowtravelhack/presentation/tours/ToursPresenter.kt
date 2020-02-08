package com.example.moscowtravelhack.presentation.tours

import com.arellomobile.mvp.InjectViewState
import com.example.moscowtravelhack.core.BasePresenter
import com.example.moscowtravelhack.domain.GlobalInteractor
import javax.inject.Inject

@InjectViewState
class ToursPresenter
@Inject constructor(
    val globalInteractor: GlobalInteractor
) : BasePresenter<ToursView>() {

}