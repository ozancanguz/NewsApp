package com.ozancanguz.newsapp.data.model


import com.google.gson.annotations.SerializedName

data class NewsResult(
    @SerializedName("date")
    val date: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("key")
    val key: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("source")
    val source: String,
    @SerializedName("url")
    val url: String
)