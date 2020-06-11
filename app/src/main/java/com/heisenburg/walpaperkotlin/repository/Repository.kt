package com.heisenburg.walpaperkotlin.repository

import androidx.lifecycle.MutableLiveData
import com.heisenburg.walpaperkotlin.executor.Executor
import com.heisenburg.walpaperkotlin.model.FileStateModel
import com.heisenburg.walpaperkotlin.model.HitsItem
import com.heisenburg.walpaperkotlin.model.ImageInfoResponse
import com.heisenburg.walpaperkotlin.util.AppLogger
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Repository {
    init {

    }

    fun getPicturesFromApi(
        page: Int,
        imageInfoResponseMutableLiveData: MutableLiveData<ImageInfoResponse>
    ) {
        val image_type = "photo"
        val editorChoice = true
        val orientation = "vertical"
        val size = 100
        Executor.execute(Runnable{
            val retrofit = getRetrofit()
            val api = retrofit.create(Api::class.java)
            val call: Call<ImageInfoResponse> = api.getImagesFromServer(
                Api.BASE_URL, image_type,
                editorChoice, orientation, size, page
            )
            call!!.enqueue(object : Callback<ImageInfoResponse> {
                override fun onResponse(
                    call: Call<ImageInfoResponse>,
                    response: Response<ImageInfoResponse>
                ) {

                    AppLogger.log(Repository.javaClass.name, response.code().toString());
                    response.errorBody()?.string()?.let {
                        AppLogger.log(Repository.javaClass.name,
                            it
                        )
                    };

                    if (response.isSuccessful()) {
                        if (imageInfoResponseMutableLiveData.getValue() == null || page == 1) {
                            imageInfoResponseMutableLiveData.postValue(response.body())
                        } else {
                            var images : ArrayList<HitsItem>? =
                                imageInfoResponseMutableLiveData.value?.hits as ArrayList<HitsItem>

                            response.body()?.hits?.let { images?.addAll(it) }

                            imageInfoResponseMutableLiveData.value!!.hits = images as List<HitsItem>

                            imageInfoResponseMutableLiveData.postValue(imageInfoResponseMutableLiveData.value)
                        }
                    }
                }

                override fun onFailure(
                    call: Call<ImageInfoResponse>,
                    t: Throwable
                ) {
                    //AppLogger.log(this.toString(), t.toString() + "")
                }
            })
        })
    }

    fun downloadPicture(
        hitsItem: HitsItem,
        fileStateModelMutableLiveData: MutableLiveData<FileStateModel?>
    ) {
//        Executor.execute({
//            val retrofit = getRetrofit()
//            val api = retrofit.create(Api::class.java)
//            val call = api.downloadFile(hitsItem.getLargeImageURL())
//            call!!.enqueue(object : Callback<ResponseBody?> {
//                override fun onResponse(
//                    call: Call<ResponseBody?>,
//                    response: Response<ResponseBody?>
//                ) {
//                    val fileStateModel = FileStateModel(response.code())
//                    if (response.isSuccessful) {
//                        val status: Boolean =
//                            AppFileManager.getInstance().writeResponseBodyToDisk(response.body())
//                        if (status) {
//                            fileStateModel.setFile(AppFileManager.getInstance().getWallpaperFile())
//                            fileStateModelMutableLiveData.postValue(fileStateModel)
//                        } else {
//                            fileStateModelMutableLiveData.postValue(fileStateModel)
//                        }
//                    }
//                    fileStateModelMutableLiveData.postValue(fileStateModel)
//                }
//
//                override fun onFailure(
//                    call: Call<ResponseBody?>,
//                    t: Throwable
//                ) {
//                }
//            })
//        })
    }


    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Api.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}