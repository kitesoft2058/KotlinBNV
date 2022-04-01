package com.kitesoft.kotlinbnv

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {

    @GET("05Retrofit/loadDB.php")
    fun loadDataFromServer(): Call<String>

    @GET("05Retrofit/loadDB.php")
    fun loadDataFromServer2(): Call<MutableList<MarketItemVO>>
}