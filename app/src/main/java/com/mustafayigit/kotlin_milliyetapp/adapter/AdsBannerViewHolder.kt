package com.mustafayigit.kotlin_milliyetapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.mustafayigit.kotlin_milliyetapp.R
import com.mustafayigit.kotlin_milliyetapp.model.BaseNewsModel
import kotlinx.android.synthetic.main.adapter_item_ads_banner.view.*

/**
 * Created By MUSTAFA
 * on 29/03/2020
 */

class AdsBannerViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate(
        R.layout.adapter_item_ads_banner,
        container,
        false
    )
) {
    fun bind(
        newsModel: BaseNewsModel,
        onItemClickListener: (BaseNewsModel) -> Unit
    ) {
        MobileAds.initialize(itemView.context) {}

        val adRequest = AdRequest.Builder().build()

        itemView.adView.loadAd(adRequest)

    }

}