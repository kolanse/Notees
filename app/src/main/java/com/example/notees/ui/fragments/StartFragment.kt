package com.example.notees.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.notees.R
import com.example.notees.databinding.FragmentStartBinding
import com.example.notees.extensions.animateMovement
import com.example.notees.navigation.AppNavigator
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Start fragment for before moving to main screen
 */

@AndroidEntryPoint
class StartFragment : Fragment() {

    private lateinit var startBinding: FragmentStartBinding

    @Inject
    lateinit var navigator: AppNavigator





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        startBinding = FragmentStartBinding.bind(view)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        var startButton = startBinding.fragmentStartLetStartBtn
       animateMovement( startButton)


        /**
         * Navigate to home fragment
         */
        startButton.setOnClickListener {

          navigator.goToFragment(R.id.homeFragment, this)

      }

    }

}