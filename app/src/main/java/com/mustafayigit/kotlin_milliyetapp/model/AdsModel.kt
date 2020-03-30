package com.mustafayigit.kotlin_milliyetapp.model

import com.google.android.gms.ads.AdSize

/**
 * Created By MUSTAFA
 * on 30/03/2020
 */

data class AdsModel(
    val adSize: AdSize,
    val adUnitID: String,
    override val itemViewType: Int
) : BaseNewsModel()