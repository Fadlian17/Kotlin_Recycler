package com.alfansyah.android.kotlin_recycler

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListFootballAdapter (val listFootball: ArrayList<Football>): RecyclerView.Adapter<ListFootballAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {

        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_football, viewGroup, false)
        return ListViewHolder(view) //To change body of created functions use File | Settings | File Templates.
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val football = listFootball[position]

        Glide.with(holder.itemView.context)
            .load(football.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = football.name
        holder.tvDetail.text = football.detail//To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return listFootball.size//To change body of created functions use File | Settings | File Templates.
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}