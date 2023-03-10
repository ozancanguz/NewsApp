package com.ozancanguz.newsapp.data.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.newsapp.R
import com.ozancanguz.newsapp.data.model.News
import com.ozancanguz.newsapp.data.model.NewsResult
import com.ozancanguz.newsapp.ui.fragments.news.NewsFragmentDirections
import com.ozancanguz.newsapp.utils.Util.Companion.loadImage
import kotlinx.android.synthetic.main.generalnews_rowlayout.view.*
import kotlinx.android.synthetic.main.rv.view.*

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
        val view=inflater.inflate(R.layout.rv,parent, false)
        return GeneralViewHolder(view)
    }

    override fun onBindViewHolder(holder: GeneralViewHolder, position: Int) {
       val currentNews=generalNews[position]

        // news name
        holder.itemView.rv_nametv.text=currentNews.name
        // glide image loading
        holder.itemView.rv_img.loadImage(currentNews.image)



        // navigation safe args
        holder.itemView.setOnClickListener {
            val direction=NewsFragmentDirections.actionNewsFragmentToNewsDetailsFragment(currentNews)
            holder.itemView.findNavController().navigate(direction)
        }



    }


    override fun getItemCount(): Int {
        return generalNews.size
    }
}