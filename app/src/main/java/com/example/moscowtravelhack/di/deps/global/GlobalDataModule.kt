package com.example.moscowtravelhack.di.deps.global

import com.example.moscowtravelhack.data.global.GlobalRepo
import com.example.moscowtravelhack.data.global.GlobalRepoImpl
import com.example.moscowtravelhack.di.scope.PerPresentationScope
import dagger.Binds
import dagger.Module

@Module
interface GlobalDataModule {

    @Binds
    @PerPresentationScope
    fun provideGlobalRepo(globalRepoImpl: GlobalRepoImpl): GlobalRepo

}