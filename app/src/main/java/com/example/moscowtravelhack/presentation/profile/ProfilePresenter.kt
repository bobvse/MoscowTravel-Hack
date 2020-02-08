package com.example.moscowtravelhack.presentation.profile

import com.arellomobile.mvp.InjectViewState
import com.example.moscowtravelhack.core.BasePresenter
import com.example.moscowtravelhack.domain.GlobalInteractor
import javax.inject.Inject

@InjectViewState
class ProfilePresenter
@Inject constructor(
    val globalInteractor: GlobalInteractor
) : BasePresenter<ProfileView>() {

}