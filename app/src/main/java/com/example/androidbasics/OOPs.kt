package com.example.androidbasics

import android.graphics.Color

fun main(){
    var p1 = MobilePhone("Android","Samsung","Galaxy S20 Ultra","Golden")
    p1.calcPrice()
    println("Color of Samsung Galaxy S20 Ultra is ${p1.color}")
    var p2 = MobilePhone()
    p2.price=7000
    p2.calcPrice()
    var p3 = MobilePhone(model = "Note 10 Pro")
}

class MobilePhone (osName: String = "Android",brand: String = "Redmi",model:String="Note 7") //Primary constructor
{
    var color: String? = null
    var brand: String?= null
    var model: String?= null
    var price:Int = 10000
    init {
        this.brand=brand
        this.model=model
        println("Initialized phone with OS Name: $osName Brand: $brand Model: $model")
    }
    //Secondary Member Constructor
    constructor(osName: String = "Android",brand: String = "Redmi",model:String="Note 7",color:String):this(osName, brand, model){
        this.color=color
        println("Initialized phone with OS Name: $osName, Brand: $brand, Model: $model, Color: $color" )
    }
    //Member function
    fun calcPrice(){
        println("Price of $brand $model is $price")
    }
}