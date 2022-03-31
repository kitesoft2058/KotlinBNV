package com.kitesoft.kotlinbnv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.kitesoft.kotlinbnv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding:ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    val fragments:MutableList<Fragment> by lazy { mutableListOf() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        fragments.add(Tab1Fragment())
        fragments.add(Tab2Fragment())
        fragments.add(Tab3Fragment())
        fragments.add(Tab4Fragment())

        supportFragmentManager.beginTransaction().add(R.id.container, fragments[0]).commit()

        binding.bnv.setOnItemSelectedListener {
            supportFragmentManager.fragments.forEach { supportFragmentManager.beginTransaction().hide(it).commit() }

            val transaction:FragmentTransaction = supportFragmentManager.beginTransaction()
            when(it.itemId){
                R.id.bnv_tab1-> transaction.show(fragments[0])
                R.id.bnv_tab2->{
                    if(!supportFragmentManager.fragments.contains(fragments[1])) transaction.add(R.id.container, fragments[1])
                    transaction.show(fragments[1])
                }
                R.id.bnv_tab3->{
                    if(!supportFragmentManager.fragments.contains(fragments[2])) transaction.add(R.id.container, fragments[2])
                    transaction.show(fragments[2])
                }
                R.id.bnv_tab4->{
                    if(!supportFragmentManager.fragments.contains(fragments[3])) transaction.add(R.id.container, fragments[3])
                    transaction.show(fragments[3])
                }
            }
            transaction.commit()

            true
        }

    }
}

