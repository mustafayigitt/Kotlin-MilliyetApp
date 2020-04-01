package com.mustafayigit.kotlin_milliyetapp.mock

import com.google.android.gms.ads.AdSize
import com.mustafayigit.kotlin_milliyetapp.enums.NewsType
import com.mustafayigit.kotlin_milliyetapp.model.*
import com.mustafayigit.kotlin_milliyetapp.ui.NewsFragment
import com.mustafayigit.kotlin_milliyetapp.ui.WriterFragment

/**
 * Created By MUSTAFA
 * on 28/03/2020
 */

object MockData {

    fun getNewsCategoryFragment(): List<FragmentModel> {
        val fragmentModelList = ArrayList<FragmentModel>()

        repeat(getTitleList().size) { position ->
            if (position == getTitleList().indexOf("YAZARLAR")) {
                fragmentModelList.add(
                    FragmentModel(position, getTitleList()[position], WriterFragment())
                )
                return@repeat

            }
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
        titleList.add("SAĞLIK")
        titleList.add("EĞİTİM")
        titleList.add("TEKNOLOJİ")

        return titleList

    }

    fun getNewsList(): List<BaseNewsModel> {
        val newsList = ArrayList<BaseNewsModel>()

        val news = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e83576955427f1ff8e9e281.jpg",
            "GÜNDEM",
            "Kayıp Uzman Çavuş Güneş ve Gülistan'ı arama çalışmaları sürüyor",
            NewsType.BIG_NEWS.id,
            false
        )
        val news2 = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x408/5e835d4a554281126c4962a2.jpg",
            "EKONOMİ",
            "Son dakika... Bakan Kurum açıkladı: 6 ay ertelendi...",
            NewsType.BIG_NEWS.id,
            false
        )

        val news3 = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e835e13554281126c4962a5.jpg",
            "GÜNDEM",
            "Son dakika haberi... Cumhurbaşkanı Erdoğan ile Trump arasında flaş görüşme! Corona virüsü...",
            NewsType.SMALL_NEWS.id,
            true
        )

        val news4 = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/750x0/5e8338215542801bd0b7a5c5",
            "SAĞLIK",
            "Adım adım maskeyi doğru takmanın yolları - Tıbbi maske nasıl takılır?",
            NewsType.SMALL_NEWS.id,
            false
        )

        val news5 = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e7e8d2d55428722d80853bb.jpg",
            "EĞİTİM",
            "Sınavlara ‘korona’ dizaynı",
            NewsType.SMALL_NEWS.id,
            true
        )


        val news6 = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/0x410/5e83257555427f1ff8e9e08c.jpg",
            "TEKNOLOJİ",
            "DxOmark dünyanın en iyi kameralı telefonunu seçti: Huawei P40 Pro",
            NewsType.BIG_NEWS.id,
            false
        )

        val news7 = NewsModel(
            "https://i2.milimaj.com/i/milliyet/75/750x0/5e8357f455428410e885dc72",
            "SPOR",
            "Alman basınından Alaba iddiası! Galatasaray...",
            NewsType.BIG_NEWS.id,
            false
        )

        val adsModel = AdsModel(
            AdSize.BANNER,
            "ca-app-pub-3940256099942544/6300978111",
            NewsType.ADS_BANNER.id
        )


        newsList.add(adsModel)
        newsList.add(news)
        newsList.add(news3)
        newsList.add(news4)
        newsList.add(news5)
        newsList.add(news6)
        newsList.add(news2)
        newsList.add(news7)

        return newsList
    }

    fun getNewsByCategory(categoryName: String): List<NewsModel> {

        val allNews = getNewsList()

        val categoryNewsList = ArrayList<NewsModel>()
        allNews.forEach {
            if (it.itemViewType != NewsType.ADS_BANNER.id) {
                if ((it as NewsModel).newsCategory == categoryName)
                    categoryNewsList.add(it)
            }
        }

        return categoryNewsList


    }

    fun getWriterList(): List<WriterModel> {
        val writerList = ArrayList<WriterModel>()

        val writerModel = WriterModel(
            "Tülin Açıkbaş",
            "Sağlık",
            "https://i2.milimaj.com/i/milliyet/75/52x52/5e71f4e45542870bc81f1edb.jpg"
        )
        val writerModel2 = WriterModel(
            "Mehmet Tez",
            "Gündem",
            "https://i2.milimaj.com/i/milliyet/75/120x120/5c8bbc3445d2a081948195ad.jpg"
        )
        val writerModel3 = WriterModel(
            "Sema Özpekmezci",
            "Teknoloji",
            "https://i2.milimaj.com/i/milliyet/75/120x120/5e81e03555428203904d40fc.jfif"
        )
        val writerModel4 = WriterModel(
            "Güneri Cıvaoğlu",
            "Ekonomi",
            "https://i2.milimaj.com/i/milliyet/75/120x120/5c8bbc3045d2a0819481944b.jpg"

        )

        writerList.add(writerModel)
        writerList.add(writerModel2)
        writerList.add(writerModel3)
        writerList.add(writerModel4)

        return writerList
    }

}