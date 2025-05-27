package com.example.simple_movie_app

import MoviesViewModel
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.simple_movie_app.databinding.ActivityHomeBinding
import okhttp3.OkHttpClient
import okhttp3.Request

class Home : AppCompatActivity() {
    lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val movies = ArrayList<MovieCardModel>()
        val adapter = movieCardAdapter(this,movies)
        val manager =  GridLayoutManager(this,2)
        val viewModel = ViewModelProvider(this)[MoviesViewModel::class.java]
        binding.progressBar.visibility = View.VISIBLE
        viewModel.getMovies()

        viewModel.movies.observe(this) { movieList ->
            binding.progressBar.visibility = View.GONE
            if (movieList != null) {
                movies.clear()
                movies.addAll(movieList)
                adapter.notifyDataSetChanged()
            }
        }

        binding.movieList.adapter = adapter
        binding.movieList.layoutManager = manager



    }
}