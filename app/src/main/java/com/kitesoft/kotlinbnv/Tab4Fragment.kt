package com.kitesoft.kotlinbnv

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kitesoft.kotlinbnv.databinding.FragmentTab1Binding
import com.kitesoft.kotlinbnv.databinding.FragmentTab2Binding
import com.kitesoft.kotlinbnv.databinding.FragmentTab3Binding
import com.kitesoft.kotlinbnv.databinding.FragmentTab4Binding

class Tab4Fragment : Fragment() {
    val binding: FragmentTab4Binding by lazy { FragmentTab4Binding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
}