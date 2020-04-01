package com.mustafayigit.kotlin_milliyetapp.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mustafayigit.kotlin_milliyetapp.R
import com.mustafayigit.kotlin_milliyetapp.adapter.NewsAdapter
import com.mustafayigit.kotlin_milliyetapp.mock.MockData
import com.mustafayigit.kotlin_milliyetapp.model.NewsModel
import com.mustafayigit.kotlin_milliyetapp.util.extToast
import kotlinx.android.synthetic.main.fragment_news.*

class NewsFragment : Fragment(R.layout.fragment_news) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        var title = arguments?.getString("title")
        if (title == null) {
            title = "ANASAYFA"
        }

        when (title) {
            "ANASAYFA" -> {
                recyclerNewsList.adapter = NewsAdapter(MockData.getNewsList()) {
                    (it as NewsModel).newsCategory extToast (requireContext())
                }
            }

            else -> {
                recyclerNewsList.adapter = NewsAdapter(MockData.getNewsByCategory(title)) {
                    (it as NewsModel).newsCategory extToast (requireContext())
                }
            }
        }


        swipeLayout.setOnRefreshListener {
            "Refresh News" extToast (requireContext())
            swipeLayout.isRefreshing = false
        }

    }


}
