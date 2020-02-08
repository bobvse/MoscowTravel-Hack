package com.example.moscowtravelhack.core.screen

import com.example.moscowtravelhack.core.base.ComponentHolder

abstract class ComponentCompanion<C : Any> {
    abstract fun createComponent(): C

    fun get(): C {
        return ComponentHolder.getOrCreate(this)
    }

    fun onFeatureFinish() {
        ComponentHolder.destroyIfNeeded(this)
    }
}