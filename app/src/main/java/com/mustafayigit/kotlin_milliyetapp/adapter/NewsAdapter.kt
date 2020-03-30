package com.mustafayigit.kotlin_milliyetapp.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mustafayigit.kotlin_milliyetapp.enums.NewsType
import com.mustafayigit.kotlin_milliyetapp.model.BaseNewsModel

/**
 * Created By MUSTAFA
 * on 29/03/2020
 */

class NewsAdapter(
    private val newsList: List<BaseNewsModel>,
    private val onItemClickListener: (BaseNewsModel) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            NewsType.SMALL_NEWS.id -> {
                SmallNewsViewHolder(parent)
            }
            NewsType.BIG_NEWS.id -> {
                BigNewsViewHolder(parent)
            }
            NewsType.ADS_BANNER.id -> {
                AdsBannerViewHolder(parent)
            }

            else -> {
                BigNewsViewHolder(parent)
            }
        }


    override fun getItemCount(): Int = newsList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val newsModel = newsList[position]

        when (newsModel.itemViewType) {
            NewsType.SMALL_NEWS.id -> {
                (holder as SmallNewsViewHolder).bind(newsModel, onItemClickListener)
            }
            NewsType.BIG_NEWS.id -> {
                (holder as BigNewsViewHolder).bind(newsModel, onItemClickListener)
            }
            NewsType.ADS_BANNER.id -> {
                (holder as AdsBannerViewHolder).bind(newsModel, onItemClickListener)
            }
            else -> {
                (holder as BigNewsViewHolder).bind(newsModel, onItemClickListener)
            }
        }
    }

    override fun getItemViewType(position: Int): Int =
        newsList[position].itemViewType


}