package com.example.notees.adapters.onclick_interface

import com.example.notees.data.Notes
import com.example.notees.data.Tags

interface OnClickNotes {

    fun onNotesClick(item: Notes, position:Int)
}