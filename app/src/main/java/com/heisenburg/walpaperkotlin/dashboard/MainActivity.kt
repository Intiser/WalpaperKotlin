package com.heisenburg.walpaperkotlin.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.heisenburg.walpaperkotlin.R
import com.heisenburg.walpaperkotlin.adapter.ImageAdapter
import com.heisenburg.walpaperkotlin.dashboard.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModel()
        initRecyclerView();
    }

    private fun initRecyclerView() {
        recyclerview.layoutManager = GridLayoutManager(this, 3)
        recyclerview.adapter = ImageAdapter(this)
        recyclerview.setItemViewCacheSize(100)
        recyclerview.setHasFixedSize(true)
    }

    private var viewModel: MainViewModel = MainViewModel();

    fun initViewModel(){
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

    }
}
