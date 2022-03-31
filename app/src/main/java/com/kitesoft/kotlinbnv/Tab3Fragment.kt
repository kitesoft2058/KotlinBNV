package com.kitesoft.kotlinbnv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kitesoft.kotlinbnv.databinding.FragmentTab1Binding
import com.kitesoft.kotlinbnv.databinding.FragmentTab2Binding
import com.kitesoft.kotlinbnv.databinding.FragmentTab3Binding

class Tab3Fragment : Fragment() {
    val binding: FragmentTab3Binding by lazy { FragmentTab3Binding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}