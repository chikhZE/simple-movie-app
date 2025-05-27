package com.example.simple_movie_app

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
        binding.info.settings.javaScriptEnabled = true
        binding.info.webViewClient = WebViewClient()
        binding.info.loadUrl(intent.getStringExtra("link").toString())
        binding.progressBar2.visibility = View.GONE
    }
}