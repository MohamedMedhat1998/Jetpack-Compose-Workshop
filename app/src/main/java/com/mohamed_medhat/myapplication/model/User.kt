package com.mohamed_medhat.myapplication.model

import com.google.gson.annotations.SerializedName

data class User(

    @field:SerializedName("image")
    val image: String,

    @field:SerializedName("country")
    val country: String,

    @field:SerializedName("Salary")
    val salary: String,

    @field:SerializedName("gender")
    val gender: String,

    @field:SerializedName("last_name")
    val lastName: String,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("first_name")
    val firstName: String,

    @field:SerializedName("email")
    val email: String
)