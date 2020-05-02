package com.heisenburg.walpaperkotlin.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.heisenburg.walpaperkotlin.R
import com.heisenburg.walpaperkotlin.dashboard.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModel()
    }

    private var viewModel: MainViewModel = MainViewModel();

    fun initViewModel(){
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

    }
}
