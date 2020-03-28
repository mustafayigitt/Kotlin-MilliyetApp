package com.mustafayigit.kotlin_milliyetapp.mock

import com.mustafayigit.kotlin_milliyetapp.model.FragmentModel
import com.mustafayigit.kotlin_milliyetapp.ui.NewsFragment

/**
 * Created By MUSTAFA
 * on 28/03/2020
 */

object MockData {
    fun getNewsCategoryFragment(fragmentSize: Int): List<FragmentModel> {
        val fragmentModelList = ArrayList<FragmentModel>()

        repeat(fragmentSize) { position ->
            fragmentModelList.add(
                FragmentModel(position, getFragmentTitle(position), NewsFragment())
            )
        }
        return fragmentModelList

    }

    private fun getFragmentTitle(position: Int): String {
        return when (position) {
            0 -> "Anasayfa"
            1 -> "Yazarlar"
            2 -> "Gündem"
            3 -> "Ekonomi"
            4 -> "Spor"
            5 -> "Cadde"
            6 -> "Eğitim"
            else -> "Diğer"
        }
    }
}