package com.ozancanguz.newsapp.ui.fragments.newsdetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ozancanguz.newsapp.R
import com.ozancanguz.newsapp.databinding.FragmentNewsWebViewBinding
import kotlinx.android.synthetic.main.fragment_news_web_view.*


class NewsWebView : Fragment() {
      private var _binding: FragmentNewsWebViewBinding? = null

    private val binding get() = _binding!!

    private val args:NewsWebViewArgs by navArgs()





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         _binding = FragmentNewsWebViewBinding.inflate(inflater, container, false)
        val view = binding.root


        getWebUrl()


        return view    }

    private fun getWebUrl() {
        val url=args.currentUrl.url
        binding.webView.loadUrl(url)
    }


}