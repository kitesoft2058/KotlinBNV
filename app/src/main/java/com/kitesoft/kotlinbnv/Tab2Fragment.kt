package com.kitesoft.kotlinbnv

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
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

    var items= mutableListOf<ItemVO>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerview.adapter= Tab2Adapter(activity as Context, items)
        binding.recyclerview.addItemDecoration(DividerItemDecoration(activity,LinearLayoutManager.VERTICAL))
        loadData()

        val ma= activity as MainActivity
        ma.setSupportActionBar(binding.toolbar)
    }

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        //if(!hidden) loadData()
    }

    fun loadData():Unit{
        Snackbar.make(binding.root, "loadData", Snackbar.LENGTH_SHORT).show()
        items.clear()

        items.add(ItemVO(1,"ANDROID","This is message.", "https://phasmaexmachina.github.io/destiny-child-mods-archive/characters/c318_01/ad00dce8ee7c4c1344a005ec153d3384/static.png"))
        items.add(ItemVO(1,"IOS","This is message.", "https://c.tenor.com/9jN9NOnQL_cAAAAi/destiny-child-animation.gif"))
        items.add(ItemVO(1,"HYBRID","This is message.", "http://thumbnail.egloos.net/600x0/http://pds21.egloos.com/pds/201803/04/00/e0095400_5a9bbf31a2d38.gif"))
        items.add(ItemVO(1,"ANDROID","This is message.", "https://phasmaexmachina.github.io/destiny-child-mods-archive/characters/c318_01/ad00dce8ee7c4c1344a005ec153d3384/static.png"))
        items.add(ItemVO(1,"IOS","This is message.", "https://c.tenor.com/9jN9NOnQL_cAAAAi/destiny-child-animation.gif"))
        items.add(ItemVO(1,"HYBRID","This is message.", "95400_5a9bbf31a2d38.gif"))
        items.add(ItemVO(1,"ANDROID","This is message.", "https://phasmaexmachina.github.io/destiny-child-mods-archive/characters/c318_01/ad00dce8ee7c4c1344a005ec153d3384/static.png"))
        items.add(ItemVO(1,"IOS","This is message.", "https://c.tenor.com/9jN9NOnQL_cAAAAi/destiny-child-animation.gif"))
        items.add(ItemVO(1,"HYBRID","This is message.", "http://thumbnail.egloos.net/600x0/http://pds21.egloos.com/pds/201803/04/00/e0095400_5a9bbf31a2d38.gif"))
        items.add(ItemVO(1,"ANDROID","This is message.", "https://phasmaexmachina.github.io/destiny-child-mods-archive/characters/c318_01/ad00dce8ee7c4c1344a005ec153d3384/static.png"))
        items.add(ItemVO(1,"IOS","This is message.", "https://c.tenor.com/9jN9NOnQL_cAAAAi/destiny-child-animation.gif"))
        items.add(ItemVO(1,"HYBRID","This is message.", "http://thumbnail.egloos.net/600x0/http://pds21.egloos.com/pds/201803/04/00/e0095400_5a9bbf31a2d38.gif"))
        items.add(ItemVO(1,"ANDROID","This is message.", "https://phasmaexmachina.github.io/destiny-child-mods-archive/characters/c318_01/ad00dce8ee7c4c1344a005ec153d3384/static.png"))
        items.add(ItemVO(1,"IOS","This is message.", "https://c.tenor.com/9jN9NOnQL_cAAAAi/destiny-child-animation.gif"))
        items.add(ItemVO(1,"HYBRID","This is message.", "http://thumbnail.egloos.net/600x0/http://pds21.egloos.com/pds/201803/04/00/e0095400_5a9bbf31a2d38.gif"))


        binding.recyclerview.adapter?.notifyDataSetChanged()
    }



}