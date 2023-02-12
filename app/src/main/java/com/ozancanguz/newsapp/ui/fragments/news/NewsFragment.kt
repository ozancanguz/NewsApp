package com.ozancanguz.newsapp.ui.fragments.news

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.ozancanguz.newsapp.data.adapters.GeneralNewsAdapter
import com.ozancanguz.newsapp.databinding.FragmentNewsBinding
import com.ozancanguz.newsapp.viewmodel.NewsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsFragment : Fragment() {
       private var _binding: FragmentNewsBinding? = null
    private val binding get() = _binding!!

    private val newsViewModel:NewsViewModel by viewModels()
    private val generalNewsAdapter=GeneralNewsAdapter()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
         _binding = FragmentNewsBinding.inflate(inflater, container, false)
        val view = binding.root

        // set up rv
        setupRv()

        // observe live data and update ui
        observeLiveData()


        return view    }

    private fun observeLiveData() {

        newsViewModel.getNews("tr","general",5)
        newsViewModel.newsList.observe(viewLifecycleOwner, Observer {
            generalNewsAdapter.setData(it)
        })

    }

    private fun setupRv() {
        binding.newsRv.layoutManager=LinearLayoutManager(requireContext())
        binding.newsRv.adapter=generalNewsAdapter
    }


}