package com.example.moscowtravelhack.presentation.tours.list

import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.moscowtravelhack.R
import com.example.moscowtravelhack.core.screen.BaseDIMoxyFragment
import com.example.moscowtravelhack.presentation.tours.list.di.ToursGraph
import kotlinx.android.synthetic.main.tours_fragment.*


class ToursFragment : BaseDIMoxyFragment<ToursGraph>(),
    ToursView {

    companion object {
        fun newInstance(): ToursFragment {
            return ToursFragment()
        }
    }

    override fun createGraph(): ToursGraph = ToursGraph()
    override fun getLayoutRes(): Int = R.layout.tours_fragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnDetailTour.setOnClickListener { presenter.onDetailTourClick() }
    }

    @InjectPresenter
    lateinit var presenter: ToursPresenter

    @ProvidePresenter
    fun provideToursPresenter() = graph.toursPresenter

}