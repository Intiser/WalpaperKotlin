package com.heisenburg.walpaperkotlin.home.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.heisenburg.walpaperkotlin.model.ImageInfoResponse
import com.heisenburg.walpaperkotlin.repository.Repository

class HomeViewModel : ViewModel() {

    var imageInfoResponse : MutableLiveData<ImageInfoResponse> = MutableLiveData();

    var current: Int = 1;

    fun getImages(){
        current = 1;
        Repository.getPicturesFromApi(current, imageInfoResponse)
    }

    fun getImagesNext(){
        current = current + 1;
        Repository.getPicturesFromApi(current, imageInfoResponse)
    }



}