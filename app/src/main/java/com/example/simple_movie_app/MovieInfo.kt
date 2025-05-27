package com.example.simple_movie_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.simple_movie_app.databinding.ActivityMovieInfoBinding
import java.util.zip.Inflater

class MovieInfo : AppCompatActivity() {
    lateinit var binding : ActivityMovieInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMovieInfoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.desc.text = intent.getStringExtra("desc")
        binding.titleTxt.text = "${intent.getStringExtra("title")}(${intent.getStringExtra("year")})"
        binding.rank.text = intent.getStringExtra("rank")
        binding.rate.text = intent.getStringExtra("rate")

    }
}
