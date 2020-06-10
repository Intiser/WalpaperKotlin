package com.heisenburg.walpaperkotlin.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.heisenburg.walpaperkotlin.R
import com.heisenburg.walpaperkotlin.model.HitsItem

class ImageAdapter(val context: Context) : RecyclerView.Adapter<ImageAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_image, parent, false);
        return Holder(view)
    }

    var arraylist : ArrayList <HitsItem> = ArrayList();

    fun setArrayList(array: ArrayList<HitsItem>){
        this.arraylist = array;
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return arraylist.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.imageview?.let {
            Glide.with(context).load(arraylist.get(position).getPreviewURL()).into(it)
        };
    }

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageview : ImageView? = itemView.findViewById(R.id.imageview)
    }

}