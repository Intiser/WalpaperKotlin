package com.heisenburg.walpaperkotlin.model

import com.google.gson.annotations.SerializedName

class HitsItem {
    @SerializedName("webformatHeight")
    private var webformatHeight = 0

    @SerializedName("imageWidth")
    private var imageWidth = 0

    @SerializedName("favorites")
    private var favorites = 0

    @SerializedName("webformatURL")
    private var webformatURL: String? = null

    @SerializedName("previewHeight")
    private var previewHeight = 0

    @SerializedName("userImageURL")
    private var userImageURL: String? = null

    @SerializedName("comments")
    private var comments = 0

    @SerializedName("previewURL")
    private var previewURL: String? = null

    @SerializedName("type")
    private var type: String? = null

    @SerializedName("imageHeight")
    private var imageHeight = 0

    @SerializedName("tags")
    private var tags: String? = null

    @SerializedName("previewWidth")
    private var previewWidth = 0

    @SerializedName("user_id")
    private var userId = 0

    @SerializedName("downloads")
    private var downloads = 0

    @SerializedName("largeImageURL")
    private var largeImageURL: String? = null

    @SerializedName("pageURL")
    private var pageURL: String? = null

    @SerializedName("id")
    private var id = 0

    @SerializedName("imageSize")
    private var imageSize = 0

    @SerializedName("webformatWidth")
    private var webformatWidth = 0

    @SerializedName("user")
    private var user: String? = null

    @SerializedName("views")
    private var views = 0

    @SerializedName("likes")
    private var likes = 0

    fun setWebformatHeight(webformatHeight: Int) {
        this.webformatHeight = webformatHeight
    }

    fun getWebformatHeight(): Int {
        return webformatHeight
    }

    fun setImageWidth(imageWidth: Int) {
        this.imageWidth = imageWidth
    }

    fun getImageWidth(): Int {
        return imageWidth
    }

    fun setFavorites(favorites: Int) {
        this.favorites = favorites
    }

    fun getFavorites(): Int {
        return favorites
    }

    fun setWebformatURL(webformatURL: String?) {
        this.webformatURL = webformatURL
    }

    fun getWebformatURL(): String? {
        return webformatURL
    }

    fun setPreviewHeight(previewHeight: Int) {
        this.previewHeight = previewHeight
    }

    fun getPreviewHeight(): Int {
        return previewHeight
    }

    fun setUserImageURL(userImageURL: String?) {
        this.userImageURL = userImageURL
    }

    fun getUserImageURL(): String? {
        return userImageURL
    }

    fun setComments(comments: Int) {
        this.comments = comments
    }

    fun getComments(): Int {
        return comments
    }

    fun setPreviewURL(previewURL: String?) {
        this.previewURL = previewURL
    }

    fun getPreviewURL(): String? {
        return previewURL
    }

    fun setType(type: String?) {
        this.type = type
    }

    fun getType(): String? {
        return type
    }

    fun setImageHeight(imageHeight: Int) {
        this.imageHeight = imageHeight
    }

    fun getImageHeight(): Int {
        return imageHeight
    }

    fun setTags(tags: String?) {
        this.tags = tags
    }

    fun getTags(): String? {
        return tags
    }

    fun setPreviewWidth(previewWidth: Int) {
        this.previewWidth = previewWidth
    }

    fun getPreviewWidth(): Int {
        return previewWidth
    }

    fun setUserId(userId: Int) {
        this.userId = userId
    }

    fun getUserId(): Int {
        return userId
    }

    fun setDownloads(downloads: Int) {
        this.downloads = downloads
    }

    fun getDownloads(): Int {
        return downloads
    }

    fun setLargeImageURL(largeImageURL: String?) {
        this.largeImageURL = largeImageURL
    }

    fun getLargeImageURL(): String? {
        return largeImageURL
    }

    fun setPageURL(pageURL: String?) {
        this.pageURL = pageURL
    }

    fun getPageURL(): String? {
        return pageURL
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun getId(): Int {
        return id
    }

    fun setImageSize(imageSize: Int) {
        this.imageSize = imageSize
    }

    fun getImageSize(): Int {
        return imageSize
    }

    fun setWebformatWidth(webformatWidth: Int) {
        this.webformatWidth = webformatWidth
    }

    fun getWebformatWidth(): Int {
        return webformatWidth
    }

    fun setUser(user: String?) {
        this.user = user
    }

    fun getUser(): String? {
        return user
    }

    fun setViews(views: Int) {
        this.views = views
    }

    fun getViews(): Int {
        return views
    }

    fun setLikes(likes: Int) {
        this.likes = likes
    }

    fun getLikes(): Int {
        return likes
    }

    override fun toString(): String {
        return "HitsItem{" +
                "webformatHeight = '" + webformatHeight + '\'' +
                ",imageWidth = '" + imageWidth + '\'' +
                ",favorites = '" + favorites + '\'' +
                ",webformatURL = '" + webformatURL + '\'' +
                ",previewHeight = '" + previewHeight + '\'' +
                ",userImageURL = '" + userImageURL + '\'' +
                ",comments = '" + comments + '\'' +
                ",previewURL = '" + previewURL + '\'' +
                ",type = '" + type + '\'' +
                ",imageHeight = '" + imageHeight + '\'' +
                ",tags = '" + tags + '\'' +
                ",previewWidth = '" + previewWidth + '\'' +
                ",user_id = '" + userId + '\'' +
                ",downloads = '" + downloads + '\'' +
                ",largeImageURL = '" + largeImageURL + '\'' +
                ",pageURL = '" + pageURL + '\'' +
                ",id = '" + id + '\'' +
                ",imageSize = '" + imageSize + '\'' +
                ",webformatWidth = '" + webformatWidth + '\'' +
                ",user = '" + user + '\'' +
                ",views = '" + views + '\'' +
                ",likes = '" + likes + '\'' +
                "}"
    }
}