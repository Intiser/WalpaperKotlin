package com.heisenburg.walpaperkotlin.model

import com.google.gson.annotations.SerializedName

class ImageInfoResponse {

    @SerializedName("hits")
    var hits: List<HitsItem>? = null

    @SerializedName("total")
    var total = 0

    @SerializedName("totalHits")
    var totalHits = 0




}