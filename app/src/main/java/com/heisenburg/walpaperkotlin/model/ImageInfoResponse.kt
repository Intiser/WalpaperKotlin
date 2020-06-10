package com.heisenburg.walpaperkotlin.model

import com.google.gson.annotations.SerializedName

class ImageInfoResponse {

    @SerializedName("hits")
    private var hits: List<HitsItem>? = null

    @SerializedName("total")
    private var total = 0

    @SerializedName("totalHits")
    private var totalHits = 0

    fun setHits(hits: List<HitsItem>?) {
        this.hits = hits
    }

    fun getHits(): List<HitsItem>? {
        return hits
    }

    fun setTotal(total: Int) {
        this.total = total
    }

    fun getTotal(): Int {
        return total
    }

    fun setTotalHits(totalHits: Int) {
        this.totalHits = totalHits
    }

    fun getTotalHits(): Int {
        return totalHits
    }

    override fun toString(): String {
        return "ImageInfoResponse{" +
                "hits = '" + hits + '\'' +
                ",total = '" + total + '\'' +
                ",totalHits = '" + totalHits + '\'' +
                "}"
    }
}