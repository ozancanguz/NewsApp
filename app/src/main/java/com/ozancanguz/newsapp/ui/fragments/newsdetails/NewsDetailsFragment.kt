package com.ozancanguz.newsapp.ui.fragments.newsdetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.newsapp.R
import com.ozancanguz.newsapp.databinding.FragmentNewsDetailsBinding


class NewsDetailsFragment : Fragment() {

       private var _binding: FragmentNewsDetailsBinding? = null

    private val binding get() = _binding!!





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
          _binding = FragmentNewsDetailsBinding.inflate(inflater, container, false)
        val view = binding.root


        return view
    }


}