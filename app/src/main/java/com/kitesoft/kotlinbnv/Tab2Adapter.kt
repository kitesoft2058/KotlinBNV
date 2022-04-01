package com.kitesoft.kotlinbnv

import android.app.Activity
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kitesoft.kotlinbnv.databinding.Tab2RecyclerItemBinding

class Tab2Adapter(val context: Context, var items:MutableList<ItemVO>) : RecyclerView.Adapter<Tab2Adapter.VH>() {

    inner class VH(val binding:Tab2RecyclerItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(Tab2RecyclerItemBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.binding.apply {
            tvTitle.text= items[position].title
            tvMsg.text= items[position].msg
            Glide.with(context).load(items[position].imageUrl).error(R.drawable.g_07).into(iv)
        }

        holder.binding.root.setOnClickListener {
            val intent= Intent(context, ItemDetailActivity::class.java)
            intent.putExtra("data", items[position].imageUrl)

            val options = ActivityOptions.makeSceneTransitionAnimation(context as Activity, holder.binding.iv,"aaa")
            context.startActivity(intent, options.toBundle())
        }
    }

    override fun getItemCount(): Int = items.size

}