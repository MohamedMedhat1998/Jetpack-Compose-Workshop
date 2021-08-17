package com.mohamed_medhat.myapplication.networking

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInjector {
    companion object {
        private var retrofitInstance: Retrofit? = null
        fun getRetrofitInstance(): Retrofit {
            if (retrofitInstance == null) {
                retrofitInstance = Retrofit.Builder().baseUrl("https://jsonkeeper.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofitInstance!!
        }
    }
}