package com.heisenburg.walpaperkotlin.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.heisenburg.walpaperkotlin.R
import com.heisenburg.walpaperkotlin.adapter.ImageAdapter
import com.heisenburg.walpaperkotlin.dashboard.viewmodel.MainViewModel
import com.heisenburg.walpaperkotlin.home.HomeFragment
import com.heisenburg.walpaperkotlin.model.HitsItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViewModel()
        initRecyclerView();
        //initFragment();
    }

    private fun initFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(layout_container.id, HomeFragment.newInstance(HomeFragment.FIRST), null)
            .commit()
    }

    val adapter : ImageAdapter = ImageAdapter(this);

    private fun initRecyclerView() {
        recyclerview.layoutManager = GridLayoutManager(this, 3)
        recyclerview.adapter = adapter
        recyclerview.setItemViewCacheSize(100)
        recyclerview.setHasFixedSize(true)
    }

    private var viewModel: MainViewModel = MainViewModel();

    fun initViewModel(){
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        viewModel.imageInfoResponseMutableLiveData.observe(this, Observer { unit ->

            adapter.setArrayList(unit.getHits() as ArrayList<HitsItem>)
        })
        viewModel.getImages()
    }
}
