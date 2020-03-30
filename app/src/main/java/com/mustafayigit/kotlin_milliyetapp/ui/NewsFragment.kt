package com.mustafayigit.kotlin_milliyetapp.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.mustafayigit.kotlin_milliyetapp.R
import com.mustafayigit.kotlin_milliyetapp.adapter.NewsAdapter
import com.mustafayigit.kotlin_milliyetapp.mock.MockData
import kotlinx.android.synthetic.main.fragment_news.*

class NewsFragment : Fragment(R.layout.fragment_news) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        recyclerNewsList.adapter = NewsAdapter(MockData.getNewsList(10)) { baseNewsModel ->

        }

    }

}
