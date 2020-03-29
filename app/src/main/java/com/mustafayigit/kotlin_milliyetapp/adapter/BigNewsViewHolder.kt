package com.mustafayigit.kotlin_milliyetapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mustafayigit.kotlin_milliyetapp.R
import com.mustafayigit.kotlin_milliyetapp.model.BigNewsModel
import kotlinx.android.synthetic.main.adapter_item_big_news.view.*

/**
 * Created By MUSTAFA
 * on 29/03/2020
 */

class BigNewsViewHolder(container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate(
        R.layout.adapter_item_big_news,
        container,
        false
    )
) {
    fun bind(
        bigNewsModel: BigNewsModel,
        onItemClickListener: (BigNewsModel) -> Unit
    ) {
        itemView.txtNewsTitle.text = bigNewsModel.newsTitle
        Glide.with(itemView.context)
            .load(bigNewsModel.newsImageUrl)
            .centerInside()
            .placeholder(R.drawable.main_logo)
            .into(itemView.imgNews)

        itemView.setOnClickListener {
            onItemClickListener(bigNewsModel)
        }
    }

}