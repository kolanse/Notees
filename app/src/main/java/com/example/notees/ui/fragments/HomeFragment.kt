package com.example.notees.ui.fragments

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.notees.R
import com.example.notees.adapters.NotesAdapter
import com.example.notees.adapters.TagsAdapter
import com.example.notees.adapters.onclick_interface.OnClickNotes
import com.example.notees.adapters.onclick_interface.OnclickTags
import com.example.notees.data.Notes
import com.example.notees.data.Tags
import com.example.notees.databinding.FragmentHomeBinding
import com.example.notees.extensions.animateMovement
import com.example.notees.extensions.generateTime
import com.example.notees.navigation.AppNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class HomeFragment : Fragment(), OnclickTags, OnClickNotes {

   var initialColor = 0
    private lateinit var homeFragmentBinding: FragmentHomeBinding
    private lateinit var recyclerTags: RecyclerView
    private lateinit var recyclerNotes: RecyclerView
    lateinit var buttonCreate: Button

    @Inject lateinit var navigator:AppNavigator
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         homeFragmentBinding = FragmentHomeBinding.inflate(inflater, container, false)

        recyclerTags = homeFragmentBinding.homeFragmentTagsRecycler
        recyclerNotes = homeFragmentBinding.homeFragmentNotesListRv



        return  homeFragmentBinding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeFragmentBinding = FragmentHomeBinding.bind(view)

       populateRecycler()

        populateNotesRecycler()

        buttonCreate = homeFragmentBinding.homeFragmentCreateBtn

        animateMovement(buttonCreate)

        buttonCreate.setOnClickListener {
            navigator.goToFragment(R.id.newNoteFragment, this)
        }
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

     fun populateRecycler(){
         var list = generateList()
         recyclerTags.adapter = TagsAdapter(list, this)
         recyclerTags.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
         recyclerTags.setHasFixedSize(true)
     }


    fun populateNotesRecycler(){
       var listNotes = generateNotes()
        recyclerNotes.adapter = NotesAdapter(listNotes, this)
        recyclerNotes.layoutManager = LinearLayoutManager(activity)
        recyclerNotes.setHasFixedSize(true)
    }



    fun generateNotes(): List<Notes>{
        var listTags = generateList()

        var ggs = mutableListOf<Notes>()
        var timeGotten = generateTime()
        ggs.add(Notes(time = timeGotten, title = "this is", content = "Checking", tags = Tags(listTags[0].tag)))
        ggs.add(Notes(time = timeGotten, title = "this is", content = "Checking", tags = Tags(listTags[1].tag)))
        ggs.add(Notes(time = timeGotten, title = "this is", content = "Checking", tags = Tags(listTags[2].tag)))
        ggs.add(Notes(time = timeGotten, title = "this is", content = "Checking", tags = Tags(listTags[1].tag)))
        ggs.add(Notes(time = timeGotten, title = "this is", content = "Checking", tags = Tags(listTags[2].tag)))
        ggs.add(Notes(time = timeGotten, title = "this is", content = "Checking", tags = Tags(listTags[1].tag)))
        ggs.add(Notes(time = timeGotten, title = "this is", content = "Checking", tags = Tags(listTags[2].tag)))

        return ggs
    }

    override fun onItemClick(item: Tags, position: Int) {
        var view =   recyclerTags.layoutManager!!.findViewByPosition(initialColor)
        initialColor = position
        var formerCard = view?.findViewById<CardView>(R.id.fragment_home_tags_recycler_items_cardview)
        var  formerText = view?.findViewById<TextView>(R.id.fragment_home_tags_recycler_items_tag_tv)
        formerCard?.setCardBackgroundColor(Color.parseColor("#F1F1F1"))
        formerText?.setTextColor(Color.parseColor("#000000"))
        Log.d("CLICKED", "${item.tag}")
    }

    override fun onNotesClick(item: Notes, position: Int) {

    }
}