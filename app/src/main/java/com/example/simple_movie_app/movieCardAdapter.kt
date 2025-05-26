package com.example.simple_movie_app

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class movieCardAdapter(
    val context: Context,
    val data: ArrayList<movieCardModle>):RecyclerView.Adapter<movieCardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movieCardViewHolder {
        return  movieCardViewHolder(
            LayoutInflater.from(context).inflate(R.layout.movie_card,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: movieCardViewHolder, position: Int) {
        holder.movieImg.setImageResource(data[position].movieImg)
        holder.movieTitle.text = data[position].movieTitle
    }
}