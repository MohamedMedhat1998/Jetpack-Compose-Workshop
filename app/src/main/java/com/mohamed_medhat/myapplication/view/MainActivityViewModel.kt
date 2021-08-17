package com.mohamed_medhat.myapplication.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mohamed_medhat.myapplication.model.User
import com.mohamed_medhat.myapplication.networking.NetworkApi
import com.mohamed_medhat.myapplication.networking.RetrofitInjector
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {
    private val api = RetrofitInjector.getRetrofitInstance().create(NetworkApi::class.java)

    private val _usersList = MutableLiveData<List<User>>()
    val usersList: LiveData<List<User>>
        get() = _usersList

    fun loadUsers() {
        viewModelScope.launch {
            val usersResponse = api.getUsers()
            if (usersResponse.isSuccessful) {
                _usersList.postValue(usersResponse.body())
            }
        }
    }
}