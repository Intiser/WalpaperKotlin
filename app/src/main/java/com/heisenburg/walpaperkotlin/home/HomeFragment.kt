package com.heisenburg.walpaperkotlin.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.heisenburg.walpaperkotlin.R
import kotlinx.android.synthetic.main.fragment_home.*


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
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onResume() {
        super.onResume()
        if(viewType == 0) this.text.setText("ZERO")
        if(viewType == 1) this.text.setText("One")
        if(viewType == 2) this.text.setText("Two")
        if(viewType == 3) this.text.setText("Three")
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
