package com.mustafayigit.kotlin_milliyetapp.mock

import com.google.android.gms.ads.AdSize
import com.mustafayigit.kotlin_milliyetapp.enums.NewsType
import com.mustafayigit.kotlin_milliyetapp.model.AdsModel
import com.mustafayigit.kotlin_milliyetapp.model.BaseNewsModel
import com.mustafayigit.kotlin_milliyetapp.model.FragmentModel
import com.mustafayigit.kotlin_milliyetapp.model.NewsModel
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

    fun getNewsList(newsListSize: Int): List<BaseNewsModel> {
        val newsList = ArrayList<BaseNewsModel>()


        val news = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e7fdbf055427f0634fe8dbc.jpg",
            "İstanbul'a yakın! Kar yağışı başladı",
            NewsType.BIG_NEWS.id
        )
        val news2 = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e7fd0a555427f0634fe8d93.jpg",
            "Son dakika | Resmi Gazete'de yayımlandı! Belediyelere corona virüs desteği",
            NewsType.BIG_NEWS.id
        )

        val news3 = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e7fbe8555427f0634fe8d3c.jpg",
            "Son dakika... Türkiye'nin corona virüsle mücadelesi! Son 24 saatte neler yaşandı?",
            NewsType.SMALL_NEWS.id
        )

        val news4 = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e7f768f5542831df08876b0.jpg",
            "Cumhurbaşkanı Erdoğan, karantina sürecinde doğum yapan Sevda Gül'ü tebrik etti",
            NewsType.SMALL_NEWS.id

        )
        val news5 = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e7fbe8555427f0634fe8d3c.jpg",
            "Son dakika... Türkiye'nin corona virüsle mücadelesi! Son 24 saatte neler yaşandı?",
            NewsType.SMALL_NEWS.id
        )
        val news6 = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e7fbe8555427f0634fe8d3c.jpg",
            "Son dakika... Türkiye'nin corona virüsle mücadelesi! Son 24 saatte neler yaşandı?",
            NewsType.SMALL_NEWS.id
        )

        val news7 = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e7fa7f8554280179829f2e4.jpg",
            "Juventus'ta futbolculardan 90 milyon euroluk fedakarlık!",
            NewsType.BIG_NEWS.id
        )

        val adsModel = AdsModel(
            AdSize.BANNER,
            "ca-app-pub-3940256099942544/6300978111",
            NewsType.ADS_BANNER.id
        )

        repeat(newsListSize) {

            newsList.add(adsModel)
            newsList.add(news)
            newsList.add(news3)
            newsList.add(news4)
            newsList.add(news5)
            newsList.add(news6)
            newsList.add(news2)
            newsList.add(news7)
        }


        return newsList
    }
}