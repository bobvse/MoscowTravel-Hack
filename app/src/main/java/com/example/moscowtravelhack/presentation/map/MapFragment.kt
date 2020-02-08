package com.example.moscowtravelhack.presentation.map

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.moscowtravelhack.R
import com.example.moscowtravelhack.core.screen.BaseDIMoxyFragment
import com.example.moscowtravelhack.presentation.map.di.MapGraph

class MapFragment : BaseDIMoxyFragment<MapGraph>(), MapView {

    companion object {
        fun newInstance(): MapFragment {
            return MapFragment()
        }
    }

    override fun createGraph(): MapGraph = MapGraph()
    override fun getLayoutRes(): Int = R.layout.map_fragment

    @InjectPresenter
    lateinit var presenter: MapPresenter

    @ProvidePresenter
    fun provideMapPresenter() = graph.mapPresenter

}