package com.mustafayigit.kotlin_milliyetapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mustafayigit.kotlin_milliyetapp.R
import com.mustafayigit.kotlin_milliyetapp.adapter.CategoryNewsAdapter
import com.mustafayigit.kotlin_milliyetapp.mock.MockData
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        init()
    }


    private fun init() {
        viewPagerNewsCategory.adapter =
            CategoryNewsAdapter(
                supportFragmentManager,
                MockData.getNewsCategoryFragment(10)
            )

        tabNewsCategory.setupWithViewPager(viewPagerNewsCategory)
    }
}
