package com.kitesoft.kotlinbnv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession
import com.bumptech.glide.Glide
import com.kitesoft.kotlinbnv.databinding.ActivityItemDetailBinding
import com.squareup.picasso.Picasso

class ItemDetailActivity : AppCompatActivity() {
    val binding:ActivityItemDetailBinding by lazy { ActivityItemDetailBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        val imgUrl= intent.getStringExtra("data")
        Glide.with(this).load(imgUrl).into(binding.iv)

        binding.iv.transitionName= "aaa"


    }
}