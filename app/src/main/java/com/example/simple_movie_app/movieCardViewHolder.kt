package com.example.simple_movie_app

import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class movieCardViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    val movieImg : ImageView = itemView.findViewById(R.id.movie_img)
    val movieTitle : TextView = itemView.findViewById(R.id.movie_name)
    val rank : TextView = itemView.findViewById(R.id.rank)
    val rating: TextView = itemView.findViewById(R.id.rating)
    val card: ConstraintLayout = itemView.findViewById(R.id.card)

}