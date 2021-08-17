package com.mohamed_medhat.myapplication.networking

import com.mohamed_medhat.myapplication.model.User
import retrofit2.Response
import retrofit2.http.GET

interface NetworkApi {
    @GET("/b/8OV9")
    suspend fun getUsers(): Response<List<User>>
}