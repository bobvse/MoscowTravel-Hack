package com.example.moscowtravelhack.presentation.profile

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.moscowtravelhack.R
import com.example.moscowtravelhack.core.screen.BaseDIMoxyFragment
import com.example.moscowtravelhack.presentation.profile.di.ProfileGraph

class ProfileFragment : BaseDIMoxyFragment<ProfileGraph>(), ProfileView {

    companion object {
        fun newInstance(): ProfileFragment {
            return ProfileFragment()
        }
    }

    override fun createGraph(): ProfileGraph = ProfileGraph()
    override fun getLayoutRes(): Int = R.layout.profile_fragment

    @InjectPresenter
    lateinit var presenter: ProfilePresenter

    @ProvidePresenter
    fun provideMapPresenter() = graph.proilePresenter

}