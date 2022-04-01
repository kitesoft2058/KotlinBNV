package com.kitesoft.kotlinbnv

import android.app.AlertDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.kitesoft.kotlinbnv.databinding.FragmentTab1Binding
import com.kitesoft.kotlinbnv.databinding.FragmentTab2Binding
import com.kitesoft.kotlinbnv.databinding.FragmentTab3Binding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class Tab3Fragment : Fragment() {
    val binding: FragmentTab3Binding by lazy { FragmentTab3Binding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.pager.adapter= Tab3PagerAdapter(activity as Context, items)
        binding.btn.setOnClickListener { networkTask() }
    }

    val items= mutableListOf<MarketItemVO>()

    fun networkTask(){
        val retrofit= RetrofitHelper.getRetrofitInstanceScalars()
        val retrofitService= retrofit.create(RetrofitService::class.java)
        retrofitService.loadDataFromServer2().enqueue(object : Callback<MutableList<MarketItemVO>>{
            override fun onResponse(
                call: Call<MutableList<MarketItemVO>>,
                response: Response<MutableList<MarketItemVO>>
            ) {
                items.clear()

                val list:MutableList<MarketItemVO>?= response.body()
                list?.forEach {
                    items.add(it)
                }
                binding.pager.adapter?.notifyDataSetChanged()
            }

            override fun onFailure(call: Call<MutableList<MarketItemVO>>, t: Throwable) {
                Snackbar.make(binding.root,"error : " + t.message, Snackbar.LENGTH_LONG).show()
            }
        })
    }

    fun networkTaskToString():Unit{

        val retrofit:Retrofit= RetrofitHelper.getRetrofitInstanceScalars()
        val retrofitService:RetrofitService= retrofit.create(RetrofitService::class.java)
        retrofitService.loadDataFromServer().enqueue(object : Callback<String> {
            override fun onResponse(call: Call<String>, response: Response<String>) {
                val s= response.body()
                AlertDialog.Builder(activity).setMessage(s).create().show()
            }

            override fun onFailure(call: Call<String>, t: Throwable) {
                Snackbar.make(binding.root,"error : " + t.message, Snackbar.LENGTH_LONG).show()
            }

        })

    }
}