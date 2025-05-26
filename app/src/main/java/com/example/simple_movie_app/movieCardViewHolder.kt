package com.example.simple_movie_app

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class movieCardViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    val movieImg : ImageView = itemView.findViewById(R.id.movie_img)
    val movieTitle : TextView = itemView.findViewById(R.id.movie_name)
}