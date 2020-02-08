package com.example.moscowtravelhack.presentation.tours.list

import android.graphics.drawable.ClipDrawable
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.moscowtravelhack.R
import com.example.moscowtravelhack.core.screen.BaseDIMoxyFragment
import com.example.moscowtravelhack.presentation.tours.list.adapter.TourModel
import com.example.moscowtravelhack.presentation.tours.list.adapter.ToursListAdapter
import com.example.moscowtravelhack.presentation.tours.list.di.ToursGraph
import kotlinx.android.synthetic.main.tours_fragment.*


class ToursFragment : BaseDIMoxyFragment<ToursGraph>(),
    ToursView {

    companion object {
        fun newInstance(): ToursFragment {
            return ToursFragment()
        }
    }

    private val adapter: ToursListAdapter by lazy { ToursListAdapter(onItemClicked = presenter::onDetailTourClick) }
    override fun createGraph(): ToursGraph = ToursGraph()
    override fun getLayoutRes(): Int = R.layout.tours_fragment

    @InjectPresenter
    lateinit var presenter: ToursPresenter

    @ProvidePresenter
    fun provideToursPresenter() = graph.toursPresenter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        addTestData()
    }

    private fun initRecyclerView() {
        rvToursList.layoutManager = GridLayoutManager(activity,1)
        rvToursList.addItemDecoration(DividerItemDecoration(activity, ClipDrawable.HORIZONTAL))
        rvToursList.adapter = adapter
    }

    private fun addTestData(){

        val testData = mutableListOf<TourModel>()
        testData.add(TourModel())
        testData.add(TourModel())
        testData.add(TourModel())
        testData.add(TourModel())
        testData.add(TourModel())
        adapter.updateItems(testData)
    }
}