package com.mustafayigit.kotlin_milliyetapp.mock

import com.mustafayigit.kotlin_milliyetapp.model.FragmentModel
import com.mustafayigit.kotlin_milliyetapp.ui.NewsFragment

/**
 * Created By MUSTAFA
 * on 28/03/2020
 */

object MockData {

    fun getNewsCategoryFragment(): List<FragmentModel> {
        val fragmentModelList = ArrayList<FragmentModel>()

        repeat(getTitleList().size) { position ->
            fragmentModelList.add(
                FragmentModel(position, getTitleList()[position], NewsFragment())
            )
        }
        return fragmentModelList

    }


    private fun getTitleList(): List<String> {
        val titleList = ArrayList<String>()
        titleList.add("ANASAYFA")
        titleList.add("YAZARLAR")
        titleList.add("GÜNDEM")
        titleList.add("EKONOMİ")
        titleList.add("SPOR")
        titleList.add("CADDE")
        titleList.add("EĞİTİM")
        titleList.add("TEKNOLOJİ")

        return titleList

    }
}