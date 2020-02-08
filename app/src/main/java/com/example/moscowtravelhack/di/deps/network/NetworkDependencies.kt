package com.example.moscowtravelhack.di.deps.network

import com.example.moscowtravelhack.core.networking.ApiService
import com.example.moscowtravelhack.core.base.SingletonWithProvider

interface NetworkDependencies{
    fun provideApi(): ApiService

    companion object : SingletonWithProvider<NetworkDependencies>()
}