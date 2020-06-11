package com.heisenburg.walpaperkotlin.model

import com.google.gson.annotations.SerializedName

class HitsItem {
    @SerializedName("webformatHeight")
    var webformatHeight = 0

    @SerializedName("imageWidth")
    var imageWidth = 0

    @SerializedName("favorites")
    var favorites = 0

    @SerializedName("webformatURL")
    var webformatURL: String? = null

    @SerializedName("previewHeight")
    var previewHeight = 0

    @SerializedName("userImageURL")
    var userImageURL: String? = null

    @SerializedName("comments")
    var comments = 0

    @SerializedName("previewURL")
    var previewURL: String? = null

    @SerializedName("type")
    var type: String? = null

    @SerializedName("imageHeight")
    var imageHeight = 0

    @SerializedName("tags")
    var tags: String? = null

    @SerializedName("previewWidth")
    var previewWidth = 0

    @SerializedName("user_id")
    var userId = 0

    @SerializedName("downloads")
    var downloads = 0

    @SerializedName("largeImageURL")
    var largeImageURL: String? = null

    @SerializedName("pageURL")
    var pageURL: String? = null

    @SerializedName("id")
    var id = 0

    @SerializedName("imageSize")
    var imageSize = 0

    @SerializedName("webformatWidth")
    var webformatWidth = 0

    @SerializedName("user")
    var user: String? = null

    @SerializedName("views")
    var views = 0

    @SerializedName("likes")
    var likes = 0
}