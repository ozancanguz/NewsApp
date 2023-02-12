package com.ozancanguz.newsapp.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ozancanguz.newsapp.R


class Util {

    companion object{
        fun ImageView.loadImage(uri: String?) {
            val options = RequestOptions()

                .error(R.drawable.news2)
            Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(uri)
                .into(this)

        }
    }
}