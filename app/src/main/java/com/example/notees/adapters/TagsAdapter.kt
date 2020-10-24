package com.example.notees.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.notees.R
import com.example.notees.data.Tags
import kotlinx.android.synthetic.main.fragment_home_tags_recycler_items.view.*

class TagsAdapter(private val tags: List<Tags>): RecyclerView.Adapter<TagsAdapter.TagsViewHolder>() {


    class TagsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val tag = itemView.findViewById<TextView>(R.id.fragment_home_tags_recycler_items_tag_tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TagsViewHolder {
     val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fragment_home_tags_recycler_items, parent, false)


        return TagsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TagsViewHolder, position: Int) {

        holder.tag.text = tags[position].tag


    }

    override fun getItemCount() = tags.size
}