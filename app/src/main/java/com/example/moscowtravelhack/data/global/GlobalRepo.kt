package com.example.moscowtravelhack.data.global

import com.example.moscowtravelhack.model.ToursListResponse
import io.reactivex.Single

interface GlobalRepo {
    fun getTours(): Single<List<ToursListResponse>>
}