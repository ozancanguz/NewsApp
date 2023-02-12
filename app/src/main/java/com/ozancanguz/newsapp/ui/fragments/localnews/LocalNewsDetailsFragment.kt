package com.ozancanguz.newsapp.ui.fragments.localnews

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.newsapp.R
import com.ozancanguz.newsapp.databinding.FragmentLocalNewsDetailsBinding


class LocalNewsDetailsFragment : Fragment() {
       private var _binding: FragmentLocalNewsDetailsBinding? = null

    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
          _binding = FragmentLocalNewsDetailsBinding.inflate(inflater, container, false)
        val view = binding.root


        return view

    }


}