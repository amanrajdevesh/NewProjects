package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.fragments.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater , R.layout.fragment_title , container , false)
        binding.insertButton.setOnClickListener {  view : View ->
           // Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_imageFragment)
            Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_imageFragment)
        }
        return binding.root
    }

}