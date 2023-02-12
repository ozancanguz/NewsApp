package com.ozancanguz.newsapp.data.api

import com.ozancanguz.newsapp.data.model.News
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface NewsApi {

    // get general news
    @Headers(
        "authorization: apikey 6XBClsiyFUwn61jEKgPcWy:7hBFCMRuNZto9F4nzaj3Mz",
        "content-type: application/json"
    )
    @GET("getNews")
    suspend fun getNews(@Query("country")country:String,
                        @Query("tag")tag:String,
                        @Query("paging")paging:Int
                        ):Response<News>



}