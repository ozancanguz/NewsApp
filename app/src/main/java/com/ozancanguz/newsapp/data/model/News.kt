package com.ozancanguz.newsapp.data.model


import com.google.gson.annotations.SerializedName

data class News(
    @SerializedName("result")
    val result: List<NewsResult>,
    @SerializedName("success")
    val success: Boolean
)