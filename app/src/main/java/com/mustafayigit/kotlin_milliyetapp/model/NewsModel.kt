package com.mustafayigit.kotlin_milliyetapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created By MUSTAFA
 * on 29/03/2020
 */

@Parcelize
data class NewsModel(
    val newsImageUrl: String,
    val newsCategory: String,
    val newsTitle: String,
    override val itemViewType: Int,
    var isSaved: Boolean
) : BaseNewsModel(), Parcelable