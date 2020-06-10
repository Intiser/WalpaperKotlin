package com.heisenburg.walpaperkotlin.repository

import com.heisenburg.walpaperkotlin.model.ImageInfoResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface Api {
    companion object{
        val BASE_URL = "https://pixabay.com/api/?key=7465948-a3a3b94191491194b5f1d08b8"
    }


    @GET
    fun getImagesFromServer(
        @Url url: String?,
        @Query("image_type") image_type: String?,
        @Query("editors_choice") editorsChoice: Boolean?,
        @Query("orientation") orientation: String?,
        @Query("per_page") size: Int,
        @Query("page") page: Int
    ): Call<ImageInfoResponse>

    @GET
    fun getImagesFromServer(
        @Query("image_type") image_type: String?,
        @Query("editors_choice") editorsChoice: Boolean?,
        @Query("orientation") orientation: String?,
        @Query("per_page") size: Int,
        @Query("page") page: Int
    ): Call<ImageInfoResponse?>?


    @GET
    fun downloadFile(@Url fileUrl: String?): Call<ResponseBody?>?
}