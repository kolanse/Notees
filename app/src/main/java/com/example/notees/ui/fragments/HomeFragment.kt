package com.example.notees.ui.fragments

import android.graphics.drawable.ClipDrawable.HORIZONTAL
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import android.widget.LinearLayout
import android.widget.LinearLayout.HORIZONTAL
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notees.R
import com.example.notees.adapters.TagsAdapter
import com.example.notees.data.Tags
import com.example.notees.databinding.FragmentHomeBinding
import com.example.notees.databinding.FragmentStartBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : Fragment() {


    private lateinit var homeFragmentBinding: FragmentHomeBinding
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


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeFragmentBinding = FragmentHomeBinding.bind(view)

       var list = generateList()
       homeFragmentBinding.homeFragmentTagsRecycler.adapter = TagsAdapter(list)
        homeFragmentBinding.homeFragmentTagsRecycler.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        homeFragmentBinding.homeFragmentTagsRecycler.setHasFixedSize(true)

    }




    fun generateList(): List<Tags>{

        var gg = mutableListOf<Tags>()

        gg.add(Tags("FOR"))
        gg.add(Tags("FAA"))
        gg.add(Tags("FHF"))
        gg.add(Tags("SFR"))
        gg.add(Tags("REW"))
        gg.add(Tags("JYR"))
        gg.add(Tags("KER"))


     return  gg
    }

}