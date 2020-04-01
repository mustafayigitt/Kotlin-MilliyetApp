package com.mustafayigit.kotlin_milliyetapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mustafayigit.kotlin_milliyetapp.R
import com.mustafayigit.kotlin_milliyetapp.model.WriterModel
import kotlinx.android.synthetic.main.adapter_item_writer.view.*

/**
 * Created By MUSTAFA
 * on 31/03/2020
 */

class WriterViewHolder(private val container: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(container.context).inflate(
        R.layout.adapter_item_writer,
        container,
        false
    )
) {


    fun bind(writer: WriterModel) {
        itemView.txtWriterName.text = writer.writerName
        itemView.txtWriterCategory.text = writer.writerCategory
        Glide.with(itemView.context)
            .load(writer.writerProfileImage)
            .circleCrop()
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(itemView.imgWriterPicture)


    }

}