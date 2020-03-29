package com.mustafayigit.kotlin_milliyetapp.mock

import com.mustafayigit.kotlin_milliyetapp.model.BigNewsModel
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

    fun getBigNewsList(newsListSize: Int): List<BigNewsModel> {
        val bigNewsList = ArrayList<BigNewsModel>()


        val news = BigNewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e7fdbf055427f0634fe8dbc.jpg",
            "İstanbul'a yakın! Kar yağışı başladı"

        )
        val news2 = BigNewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e7fd0a555427f0634fe8d93.jpg",
            "Son dakika | Resmi Gazete'de yayımlandı! Belediyelere corona virüs desteği"
        )

        val news3 = BigNewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e7fbe8555427f0634fe8d3c.jpg",
            "Son dakika... Türkiye'nin corona virüsle mücadelesi! Son 24 saatte neler yaşandı?"
        )

        val news4 = BigNewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e7f768f5542831df08876b0.jpg",
            "Cumhurbaşkanı Erdoğan, karantina sürecinde doğum yapan Sevda Gül'ü tebrik etti"

        )

        val news5 = BigNewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e7fa7f8554280179829f2e4.jpg",
            "Juventus'ta futbolculardan 90 milyon euroluk fedakarlık!"
        )
        repeat(newsListSize) {
            bigNewsList.add(news)
            bigNewsList.add(news2)
            bigNewsList.add(news3)
            bigNewsList.add(news4)
            bigNewsList.add(news5)
        }


        return bigNewsList
    }
}