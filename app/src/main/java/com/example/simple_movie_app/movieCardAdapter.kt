package com.example.simple_movie_app

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class movieCardAdapter(
    val context: Context,
    val data: ArrayList<MovieCardModel>):RecyclerView.Adapter<movieCardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): movieCardViewHolder {
        return  movieCardViewHolder(
            LayoutInflater.from(context).inflate(R.layout.movie_card,parent,false)
        )
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: movieCardViewHolder, position: Int) {
        //holder.movieImg.setImageResource(data[position].movieImg)
        holder.movieTitle.text = data[position].title
        holder.rank.text = data[position].rank.toString()
        Picasso.get().load(data[position].image).into(holder.movieImg)
        holder.rating.text = data[position].rating.toString()
        holder.card.setOnClickListener {
            val i = Intent(context,MovieInfo::class.java)
            i.putExtra("link",data[position].imdb_link)
           context.startActivity(i)

       }

    }
}