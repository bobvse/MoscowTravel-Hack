package com.example.moscowtravelhack.domain

import com.example.moscowtravelhack.data.global.GlobalRepo
import com.example.moscowtravelhack.model.ToursListResponse
import io.reactivex.Single
import javax.inject.Inject

class GlobalInteractor
@Inject constructor(
    private val globalRepo: GlobalRepo
) : GlobalUseCase {

    fun getToursList(): Single<List<ToursListResponse>> {
        return globalRepo.getTours()
    }
}