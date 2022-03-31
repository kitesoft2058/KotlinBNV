package com.kitesoft.kotlinbnv

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kitesoft.kotlinbnv.databinding.FragmentTab1Binding
import com.kitesoft.kotlinbnv.databinding.FragmentTab2Binding

class Tab2Fragment : Fragment() {
    val binding: FragmentTab2Binding by lazy { FragmentTab2Binding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    //처음 activity 에 add 될때 호출.
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(activity, "on attach", Toast.LENGTH_SHORT).show()
    }
}