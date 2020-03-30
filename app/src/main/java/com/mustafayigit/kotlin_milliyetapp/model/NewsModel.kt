package com.mustafayigit.kotlin_milliyetapp.model

/**
 * Created By MUSTAFA
 * on 29/03/2020
 */

data class NewsModel(
    val newsImageUrl: String,
    val newsTitle: String,
    override val itemViewType: Int,
    var isSaved: Boolean
) : BaseNewsModel()