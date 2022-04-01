package com.kitesoft.kotlinbnv

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

class RetrofitHelper {
    companion object{
        val hostUrl="http://mrhi2022.dothome.co.kr"

        fun getRetrofitInstanceScalars():Retrofit{
            val retrofit= Retrofit.Builder().run {
                baseUrl(hostUrl)
                addConverterFactory(ScalarsConverterFactory.create())
                addConverterFactory(GsonConverterFactory.create())
                build()
            }
            return retrofit
        }
    }
}