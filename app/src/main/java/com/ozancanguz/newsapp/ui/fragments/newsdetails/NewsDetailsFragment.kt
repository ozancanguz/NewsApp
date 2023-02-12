package com.ozancanguz.newsapp.ui.fragments.newsdetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.ozancanguz.newsapp.R
import com.ozancanguz.newsapp.databinding.FragmentNewsDetailsBinding
import com.ozancanguz.newsapp.ui.fragments.news.NewsFragmentDirections
import com.ozancanguz.newsapp.utils.Util.Companion.loadImage
import kotlinx.android.synthetic.main.activity_main.*


class NewsDetailsFragment : Fragment() {

       private var _binding: FragmentNewsDetailsBinding? = null

    private val binding get() = _binding!!
    private val args:NewsDetailsFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
          _binding = FragmentNewsDetailsBinding.inflate(inflater, container, false)
        val view = binding.root


        // update ui
        getDetails()

        // send web url
        sendWebUrl()

        return view
    }

    private fun sendWebUrl() {
        binding.gotonewsbtn.setOnClickListener {
            val url=NewsDetailsFragmentDirections.actionNewsDetailsFragmentToNewsWebView(args.currentgn)
          findNavController().navigate(url)

        }
    }

    private fun getDetails() {
        var args= args.currentgn
        binding.gndetailsimg.loadImage(args.image)
        binding.gndetailsdescription.text=args.description
        binding.gndetailssource.text=args.source
    }


}