package com.example.moscowtravelhack.data.global

import com.example.moscowtravelhack.core.networking.ApiService
import com.example.moscowtravelhack.model.ToursListResponse
import io.reactivex.Single
import javax.inject.Inject

class GlobalRepoImpl
@Inject constructor(
    val api: ApiService
) : GlobalRepo {

    override fun getTours(): Single<List<ToursListResponse>> {
        return api.getTours()
    }
}