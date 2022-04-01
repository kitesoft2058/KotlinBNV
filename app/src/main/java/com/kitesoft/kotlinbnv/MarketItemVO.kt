package com.kitesoft.kotlinbnv

import com.google.gson.annotations.SerializedName

data class MarketItemVO(val no:Int, val name:String, val title:String,@SerializedName("msg") val message:String, val price:String, val file:String, val date:String)
