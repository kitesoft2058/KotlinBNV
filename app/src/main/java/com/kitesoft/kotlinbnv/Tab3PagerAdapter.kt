package com.kitesoft.kotlinbnv

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kitesoft.kotlinbnv.databinding.ActivityItemDetailBinding
import com.kitesoft.kotlinbnv.databinding.Tab3PagerItemBinding

class Tab3PagerAdapter(val context:Context, val items:MutableList<MarketItemVO>) : RecyclerView.Adapter<Tab3PagerAdapter.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(Tab3PagerItemBinding.inflate(LayoutInflater.from(context),parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding.apply {
            tvTitle.text=items[position].title
            tvMsg.text= items[position].message
            val imgUrl= "http://mrhi2022.dothome.co.kr/05Retrofit/${items[position].file}"
            Glide.with(context).load(imgUrl).error(R.drawable.g_07).into(iv)
            Log.i("imgUrl", imgUrl)
        }
    }

    override fun getItemCount(): Int = items.size

    inner class VH(val binding: Tab3PagerItemBinding) : RecyclerView.ViewHolder(binding.root)
}