package com.mustafayigit.kotlin_milliyetapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.mustafayigit.kotlin_milliyetapp.R
import com.mustafayigit.kotlin_milliyetapp.model.NewsModel
import kotlinx.android.synthetic.main.fragment_detail.*

/**
 * A simple [Fragment] subclass.
 */
class DetailFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = arguments
        val news = bundle?.getParcelable<NewsModel>("keyNews")
        if (news != null)
            bindUI(news)

    }


    private fun bindUI(news: NewsModel) {
        txtDetailHeader.text = news.newsTitle
        txtDetailContent.text = """
            |Title: ${news.newsTitle}
            |Category: ${news.newsCategory}
            |ImageUrl ${news.newsImageUrl}""".trimMargin()

        Glide.with(requireContext())
            .load(news.newsImageUrl)
            .into(imgDetailPhoto)

    }

}
