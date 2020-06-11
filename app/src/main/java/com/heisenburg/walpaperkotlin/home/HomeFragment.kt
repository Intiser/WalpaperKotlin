package com.heisenburg.walpaperkotlin.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.heisenburg.walpaperkotlin.R
import com.heisenburg.walpaperkotlin.adapter.ImageAdapter
import com.heisenburg.walpaperkotlin.home.viewmodel.HomeViewModel
import com.heisenburg.walpaperkotlin.model.HitsItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.recyclerview


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    var viewType = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        initViewModel()
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    var viewModel: HomeViewModel = HomeViewModel()

    private fun initViewModel() {
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        viewModel.imageInfoResponse.observe(this, Observer { values ->
            adapter?.setArrayList(values.hits as ArrayList<HitsItem>)
        })
        viewModel.getImages()
    }

    override fun onResume() {
        super.onResume()
        initRecyclerView()
    }

    var adapter: ImageAdapter? = context?.let { ImageAdapter(it) };

    private fun initRecyclerView() {
        recyclerview.layoutManager =
            GridLayoutManager(context, 3);
        adapter = context?.let { ImageAdapter(it) }
        recyclerview.adapter = adapter;
        recyclerview.setItemViewCacheSize(1000)
        recyclerview.setHasFixedSize(true)
        val listener = object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if(!recyclerView.canScrollVertically(1)){
                    viewModel.getImagesNext()
                }
            }
        }
        recyclerview.addOnScrollListener(listener)
    }

    companion object {
        val FIRST = 1;
        val SECOND = 2;
        val THIRD = 3;
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(viewType: Int) =
            HomeFragment().apply {
                 this.viewType = viewType;
            }
    }
}
