package com.example.moscowtravelhack.core.networking

import com.example.moscowtravelhack.model.ToursListResponse
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("/api/v1/tours")
    fun getTours(): Single<List<ToursListResponse>>

//    @GET("Company/{id}")
//    fun getCompany(@Path("id") id: String): Single<CompanyResponse>
//
//    @GET("Documents/{id}")
//    fun getDocuments(@Path("id") id: String): Single<DocumentsResponse>
}