package com.example.notees.adapters

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.notees.R
import com.example.notees.adapters.onclick_interface.OnclickTags
import com.example.notees.data.Tags

class TagsAdapter(private val tags: List<Tags>, var listener: OnclickTags ): RecyclerView.Adapter<TagsAdapter.TagsViewHolder>() {
    class TagsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var colored = 0
        val tag = itemView.findViewById<TextView>(R.id.fragment_home_tags_recycler_items_tag_tv)
        val tagBackground = itemView.findViewById<CardView>(R.id.fragment_home_tags_recycler_items_cardview)

        fun initialise(item: Tags, action: OnclickTags, position: Int){
            tag.text = item.tag

            if (position == 0){
                tagBackground.setCardBackgroundColor(Color.parseColor("#58acf6"))
                tag.setTextColor(Color.parseColor("#FFFFFF"))
            }
            itemView.setOnClickListener {
                colored = position
                action.onItemClick(item, adapterPosition)
                tagBackground.setCardBackgroundColor(Color.parseColor("#58acf6"))
                tag.setTextColor(Color.parseColor("#FFFFFF"))
                Log.d("ITEMCLICKED", "$item")
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TagsViewHolder {
     val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fragment_home_tags_recycler_items, parent, false)
        return TagsViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TagsViewHolder, position: Int) {
        holder.initialise(tags[position], listener, position)
    }

    override fun getItemCount() = tags.size
}