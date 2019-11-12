package com.alfansyah.android.kotlin_recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridFootballAdapter(val listFootballs:ArrayList<Football>) :RecyclerView.Adapter<GridFootballAdapter.GridViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_football, viewGroup, false)
        return GridViewHolder(view) //To change body of created functions use File | Settings | File Templates.
    }
    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listFootballs[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto) //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return listFootballs.size//To change body of created functions use File | Settings | File Templates.
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}