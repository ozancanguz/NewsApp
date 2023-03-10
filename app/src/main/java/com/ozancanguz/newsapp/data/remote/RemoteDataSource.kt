package com.ozancanguz.newsapp.data.remote

import com.ozancanguz.newsapp.data.api.NewsApi
import com.ozancanguz.newsapp.data.model.News
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource@Inject constructor(private val newsApi: NewsApi) {

    // get general news function
    suspend fun getNews(country:String,tag:String,paging:Int):Response<News>{
        return newsApi.getNews(country,tag,paging)
    }


}