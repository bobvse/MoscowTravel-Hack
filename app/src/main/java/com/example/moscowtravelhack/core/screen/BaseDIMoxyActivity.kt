package com.example.moscowtravelhack.core.screen

import com.example.moscowtravelhack.core.base.BaseGraph


abstract class BaseDIMoxyActivity<G : BaseGraph<*>> : MoxyActivity() {

    val graph by lazy { uninitializedGraph.apply { init() } }

    private val uninitializedGraph by lazy { createGraph() }

    abstract fun createGraph(): G
}