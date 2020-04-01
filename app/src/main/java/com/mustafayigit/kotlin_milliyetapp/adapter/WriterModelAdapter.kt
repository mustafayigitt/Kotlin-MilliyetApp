package com.mustafayigit.kotlin_milliyetapp.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mustafayigit.kotlin_milliyetapp.model.WriterModel

/**
 * Created By MUSTAFA
 * on 31/03/2020
 */

class WriterModelAdapter(private val writerList: List<WriterModel>) :
    RecyclerView.Adapter<WriterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WriterViewHolder =
        WriterViewHolder(parent)

    override fun getItemCount(): Int = writerList.size

    override fun onBindViewHolder(holder: WriterViewHolder, position: Int) =
        holder.bind(writerList[position])

}