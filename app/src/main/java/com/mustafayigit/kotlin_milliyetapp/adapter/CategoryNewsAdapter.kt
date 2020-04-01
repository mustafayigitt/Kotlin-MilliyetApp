package com.mustafayigit.kotlin_milliyetapp.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.mustafayigit.kotlin_milliyetapp.model.FragmentModel

/**
 * Created By MUSTAFA
 * on 28/03/2020
 */

class CategoryNewsAdapter(
    fragmentManager: FragmentManager,
    private val newsFragmentList: List<FragmentModel>
) : FragmentStatePagerAdapter(
    fragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getItem(position: Int): Fragment {
        val fragment = newsFragmentList[position].fragment
        val bundle = Bundle()
        bundle.putString("title", getPageTitle(position) as String?)
        fragment.arguments = bundle
        return newsFragmentList[position].fragment
    }

    override fun getCount(): Int = newsFragmentList.size

    override fun getPageTitle(position: Int): CharSequence? = newsFragmentList[position].title

}