package com.example.myapplication.activities

import android.content.AbstractThreadedSyncAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    private lateinit var movieAdapter: MovieAdapter
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var movieList: Array<Movie> 0 ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
