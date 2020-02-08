package com.example.moscowtravelhack.presentation.tours.detail

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.moscowtravelhack.R
import com.example.moscowtravelhack.core.itemdecoration.SpaceHorizontalItemDecoration
import com.example.moscowtravelhack.core.screen.BaseDIMoxyFragment
import com.example.moscowtravelhack.model.PicturesData
import com.example.moscowtravelhack.presentation.tours.detail.adapter.PicturesAdapter
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
        initRecyclerView()

        app_bar.addOnOffsetChangedListener(object : OnOffsetChangedListener {
            var isShow = false
            var scrollRange = -1
            override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.totalScrollRange

                }
                if (scrollRange + verticalOffset == 0) {
                    //  btnBuy.visibility = View.GONE
                    isShow = true
                } else if (isShow) {
                    isShow = false
                    //btnBuy.visibility = View.VISIBLE
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

    private val seeAdapeter: PicturesAdapter by lazy {
        PicturesAdapter(
            onItemClicked = presenter::onPictureClick
        )
    }

    fun initRecyclerView() {
        rvPictureSee.adapter = seeAdapeter
        rvPictureSee.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        rvPictureSee.addItemDecoration(SpaceHorizontalItemDecoration(resources.getDimension(R.dimen.indent_x2).toInt()))

        val list = mutableListOf<PicturesData>()
        list.add(PicturesData("1"))
        list.add(PicturesData("1"))
        list.add(PicturesData("1"))
        list.add(PicturesData("1"))
        list.add(PicturesData("1"))
        list.add(PicturesData("1"))

        seeAdapeter.updateItems(list)
    }

}