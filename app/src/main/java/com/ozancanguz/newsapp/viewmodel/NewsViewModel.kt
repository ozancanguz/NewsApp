package com.ozancanguz.newsapp.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ozancanguz.newsapp.data.model.News
import com.ozancanguz.newsapp.data.model.NewsResult
import com.ozancanguz.newsapp.repository.Repository
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel@Inject constructor(private val repository: Repository, application: Application):AndroidViewModel(application) {

    val newsList=MutableLiveData<News>()

    fun getNews(country:String,tag:String,paging:Int){
        viewModelScope.launch {
            val response=repository.remote.getNews(country,tag,paging)
            if(response.isSuccessful){

                newsList.postValue(response.body())
            }else{
                Log.d("newsviewmodel","No data")
            }
        }

    }


}