package com.example.moscowtravelhack.presentation.tours.detail

import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.moscowtravelhack.R
import com.example.moscowtravelhack.core.screen.BaseDIMoxyFragment
import com.example.moscowtravelhack.presentation.tours.detail.di.TourDetailGraph
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener
import kotlinx.android.synthetic.main.detail_tour_fragment.*


class TourDetailFragment : BaseDIMoxyFragment<TourDetailGraph>(), TourDetailView {

    companion object {
        fun newInstance(): TourDetailFragment {
            return TourDetailFragment()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        app_bar.addOnOffsetChangedListener(object : OnOffsetChangedListener {
            var isShow = false
            var scrollRange = -1
            override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.totalScrollRange
                }
                if (scrollRange + verticalOffset == 0) {
                    isShow = true
                   // showOption(R.id.action_info)
                } else if (isShow) {
                    isShow = false
                   // hideOption(R.id.action_info)
                }
            }
        })

    }

    override fun createGraph(): TourDetailGraph = TourDetailGraph()
    override fun getLayoutRes(): Int = R.layout.detail_tour_fragment

    @InjectPresenter
    lateinit var presenter: TourDetailPresenter

    @ProvidePresenter
    fun provideToursDetailPresenter() = graph.toursDetailPresenter

}