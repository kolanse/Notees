package com.example.notees.adapters

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.notees.R
import com.example.notees.adapters.onclick_interface.OnClickNotes
import com.example.notees.data.Notes
import kotlinx.android.synthetic.main.fragment_home_recycler_notes_item.*

class NotesAdapter(private val notes: List<Notes>, var notesListener: OnClickNotes): RecyclerView.Adapter<NotesAdapter.NotesViewHolder>() {


    class NotesViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
        val notesTitle = itemView.findViewById<TextView>(R.id.fragment_home_recycler_notes_title_tv)
        val notesTag = itemView.findViewById<TextView>(R.id.fragment_home_recycler_notes_tag_tv)
        val notesTime = itemView.findViewById<TextView>(R.id.fragment_home_recycler_notes_time_tv)

        fun initialise(note: Notes, action: OnClickNotes){

            notesTitle.text = note.title
            notesTag.text = note.tags.tag
            notesTime.text = note.time


            itemView.setOnClickListener {
                action.onNotesClick(note, adapterPosition)
            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotesViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.fragment_home_recycler_notes_item, parent, false)

        return NotesViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NotesViewHolder, position: Int) {

        holder.initialise(notes[position], notesListener)
    }

    override fun getItemCount() = notes.size
}