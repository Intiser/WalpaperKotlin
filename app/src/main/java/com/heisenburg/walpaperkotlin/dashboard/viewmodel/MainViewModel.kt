package com.heisenburg.walpaperkotlin.dashboard.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heisenburg.walpaperkotlin.model.ImageInfoResponse
import com.heisenburg.walpaperkotlin.repository.Repository

class MainViewModel : ViewModel() {


    val imageInfoResponseMutableLiveData =
        MutableLiveData<ImageInfoResponse>()

    fun getImages() {
        Repository.getPicturesFromApi(1, imageInfoResponseMutableLiveData)
    }


}