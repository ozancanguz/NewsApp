package com.ozancanguz.newsapp.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.newsapp.R
import com.ozancanguz.newsapp.data.model.News
import com.ozancanguz.newsapp.data.model.NewsResult
import kotlinx.android.synthetic.main.generalnews_rowlayout.view.*

class GeneralNewsAdapter:RecyclerView.Adapter<GeneralNewsAdapter.GeneralViewHolder>() {
    class GeneralViewHolder(view: View):RecyclerView.ViewHolder(view){

    }

    var generalNews= emptyList<NewsResult>()

    fun setData(newData: News){
        this.generalNews=newData.result
        notifyDataSetChanged()
     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneralViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.generalnews_rowlayout,parent, false)
        return GeneralViewHolder(view)
    }

    override fun onBindViewHolder(holder: GeneralViewHolder, position: Int) {
       val currentNews=generalNews[position]
        holder.itemView.datetv.text=currentNews.date
        holder.itemView.sourcetv.text=currentNews.source
        holder.itemView.nametv.text=currentNews.name

        // glide image loading
    }

    override fun getItemCount(): Int {
        return generalNews.size
    }
}