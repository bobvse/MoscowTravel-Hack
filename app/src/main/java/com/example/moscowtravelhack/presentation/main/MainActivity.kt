package com.example.moscowtravelhack.presentation.main

import android.os.Bundle
import android.view.MenuItem
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.example.moscowtravelhack.R
import com.example.moscowtravelhack.core.screen.BaseDIMoxyActivity
import com.example.moscowtravelhack.presentation.main.di.MainGraph
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.main_activity.*
import ru.terrakok.cicerone.android.support.SupportAppNavigator

class MainActivity : BaseDIMoxyActivity<MainGraph>(), MainView,
    BottomNavigationView.OnNavigationItemSelectedListener {

    @InjectPresenter
    lateinit var presenter: MainPresenter

    @ProvidePresenter
    fun provideLoginPresenter(): MainPresenter {
        graph.mainPresenter.init()
        return graph.mainPresenter
    }

    override fun createGraph(): MainGraph = MainGraph()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)
        bottomNavigation.inflateMenu(R.menu.menu_bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)
    }

    private val navigator: SupportAppNavigator by lazy {
        SupportAppNavigator(this, supportFragmentManager, R.id.screen_container)
    }

    override fun onResumeFragments() {
        presenter.setNavigator(navigator)
        super.onResumeFragments()
    }

    override fun onPause() {
        presenter.removeNavigator()
        super.onPause()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_map -> {
                presenter.openMapScreen()
            }
            R.id.action_tours -> {
                presenter.openToursScreen()
            }
            R.id.action_profile -> {
                presenter.openProfileScreen()
            }
        }
        // router.navigateTo(Pair(currentFragment, frTag))
        return true
    }
}
