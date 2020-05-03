package com.heisenburg.walpaperkotlin.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.heisenburg.walpaperkotlin.R

class ImageAdapter(val context: Context) : RecyclerView.Adapter<ImageAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_image, parent, false);
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.imageview?.setImageResource(R.drawable.sample)
    }

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageview : ImageView? = itemView.findViewById(R.id.imageview)
    }

}