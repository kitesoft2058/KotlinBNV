package com.kitesoft.kotlinbnv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kitesoft.kotlinbnv.databinding.FragmentTab1Binding

class Tab1Fragment : Fragment() {
    val binding:FragmentTab1Binding by lazy { FragmentTab1Binding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.tv.setText("Nice")
    }
}