package com.ozancanguz.newsapp.ui.fragments.news

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.newsapp.R
import com.ozancanguz.newsapp.databinding.FragmentNewsBinding


class NewsFragment : Fragment() {
       private var _binding: FragmentNewsBinding? = null

    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
         _binding = FragmentNewsBinding.inflate(inflater, container, false)
        val view = binding.root


        return view    }


}