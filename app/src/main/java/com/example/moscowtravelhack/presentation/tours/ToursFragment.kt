package com.example.moscowtravelhack.presentation.tours

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.moscowtravelhack.R
import com.example.moscowtravelhack.core.screen.BaseDIMoxyFragment
import com.example.moscowtravelhack.presentation.tours.di.ToursGraph


class ToursFragment : BaseDIMoxyFragment<ToursGraph>(), ToursView {

    companion object {
        fun newInstance(): ToursFragment {
            return ToursFragment()
        }
    }

    override fun createGraph(): ToursGraph = ToursGraph()
    override fun getLayoutRes(): Int = R.layout.tours_fragment

    @InjectPresenter
    lateinit var presenter: ToursPresenter

    @ProvidePresenter
    fun provideToursPresenter() = graph.toursPresenter

}