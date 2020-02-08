package com.example.moscowtravelhack.di.deps.global

import com.example.moscowtravelhack.core.base.SingletonWithProvider
import com.example.moscowtravelhack.domain.GlobalInteractor
import com.example.moscowtravelhack.domain.GlobalUseCase

interface GlobalDependencies {

    fun provideGlobalInteractor(): GlobalInteractor

    companion object : SingletonWithProvider<GlobalDependencies>()
}