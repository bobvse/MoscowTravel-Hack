package com.example.moscowtravelhack.presentation.tours.detail

import com.arellomobile.mvp.InjectViewState
import com.example.moscowtravelhack.core.BasePresenter
import com.example.moscowtravelhack.domain.GlobalInteractor
import com.example.moscowtravelhack.model.PicturesData
import javax.inject.Inject

@InjectViewState
class TourDetailPresenter
@Inject constructor(
    val globalInteractor: GlobalInteractor
) : BasePresenter<TourDetailView>() {

    fun onPictureClick(pictureDta: PicturesData) {

    }
}