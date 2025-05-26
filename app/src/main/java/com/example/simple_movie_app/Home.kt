package com.example.simple_movie_app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simple_movie_app.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val movies = ArrayList<movieCardModle>()
        movies.add(movieCardModle(R.drawable.poster1,"Jocker"))
        movies.add(movieCardModle(R.drawable.poster1,"Jocker"))
        movies.add(movieCardModle(R.drawable.poster1,"Jocker"))
        movies.add(movieCardModle(R.drawable.poster1,"Jocker"))
        movies.add(movieCardModle(R.drawable.poster1,"Jocker"))
        movies.add(movieCardModle(R.drawable.poster1,"Jocker"))
        movies.add(movieCardModle(R.drawable.poster1,"Jocker"))
        val adapter = movieCardAdapter(this,movies)
        val manager = LinearLayoutManager(this)
        binding.movieList.adapter = adapter
        binding.movieList.layoutManager = manager
    }
}