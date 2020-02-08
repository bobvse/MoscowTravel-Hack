package com.example.moscowtravelhack.di.deps.context

import android.content.Context
import com.example.moscowtravelhack.core.base.SingletonWithProvider

interface ContextDependencies {
    fun provideContext(): Context

    companion object : SingletonWithProvider<ContextDependencies>()
}