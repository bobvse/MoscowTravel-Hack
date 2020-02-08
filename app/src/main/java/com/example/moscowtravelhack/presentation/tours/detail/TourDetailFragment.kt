package com.example.moscowtravelhack.presentation.tours.detail

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.moscowtravelhack.R
import com.example.moscowtravelhack.core.screen.BaseDIMoxyFragment
import com.example.moscowtravelhack.presentation.tours.detail.di.TourDetailGraph

class TourDetailFragment : BaseDIMoxyFragment<TourDetailGraph>(), TourDetailView {

    companion object {
        fun newInstance(): TourDetailFragment {
            return TourDetailFragment()
        }
    }

    override fun createGraph(): TourDetailGraph = TourDetailGraph()
    override fun getLayoutRes(): Int = R.layout.detail_tour_fragment

    @InjectPresenter
    lateinit var presenter: TourDetailPresenter

    @ProvidePresenter
    fun provideToursDetailPresenter() = graph.toursDetailPresenter

}