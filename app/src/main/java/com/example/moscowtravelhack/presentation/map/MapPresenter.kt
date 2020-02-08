package com.example.moscowtravelhack.presentation.map

import com.arellomobile.mvp.InjectViewState
import com.example.moscowtravelhack.core.BasePresenter
import com.example.moscowtravelhack.domain.GlobalInteractor
import javax.inject.Inject

@InjectViewState
class MapPresenter
@Inject constructor(
    val globalInteractor: GlobalInteractor
) : BasePresenter<MapView>() {

}