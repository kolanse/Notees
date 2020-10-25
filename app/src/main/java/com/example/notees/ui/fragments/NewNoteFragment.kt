package com.example.notees.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.notees.R
import com.example.notees.databinding.FragmentNewNoteBinding

/**
 * Fragment for New Notes as well as editing Old Notes
 */
class NewNoteFragment : Fragment() {

   private lateinit var newNotesBinding: FragmentNewNoteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        newNotesBinding = FragmentNewNoteBinding.inflate(inflater, container, false)



        return newNotesBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}