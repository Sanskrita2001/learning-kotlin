package com.example.androidbasics

import java.lang.IllegalArgumentException
import java.util.*

fun main(){
    // create an object like so:
    // You can use primary or secondary Constructor to create an object
    // Calls the secondary constructor
    var p1 = MobilePhone("Android","Samsung","Galaxy S20 Ultra","Golden")
    // you access or modify a property using the dot(.) notation.
    p1.calcPrice()
    println("Color of Samsung Galaxy S20 Ultra is ${p1.color}")
    // Calls the primary constructor
    var p2 = MobilePhone()
    p2.price=7000
    println("Ram is ${p2.ram}")
    p2.calcPrice()
    var p3 = MobilePhone(model = "Note 10 Pro")
}

class MobilePhone (osName: String = "Android",brand: String = "Redmi",model:String="Note 7") //Primary constructor
{
    // Member Variables (Properties) of the class
    lateinit var color: String
    var brand: String?= null
    var model: String?= null
    private set
    var price:Int = 10000
        set(value) {
        field = if (value>0) value else throw IllegalArgumentException("Price cannot be less than 0")
    }
    var ram:String = "2GB"
        //Custom Getter
        get(){
            return field.lowercase(Locale.getDefault())
        }
    // Initializer Block
    init {
        this.brand=brand
        this.model=model
        println("Initialized phone with OS Name: $osName, Brand: $brand, Model: $model")
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

// Kotlin internally generates a default getter and setter for mutable properties, and a getter (only) for read-only properties.
/*
* It calls these getters and setters internally whenever
* This is how it would look like internally
class Car(_brand: String, _model: String, _maxSpeed: Int) {
    val brand: String = _brand
        get() = field

    var model: String = _model
        get() = field
        set(value) {
            field = value
        }

    var maxSpeed: Int = _maxSpeed
        get() = field
        set(value) {
            field = value
        }
} */
// value
// We use value as the name of the setter parameter. This is the default convention in Kotlin but you’re free to use any other name if you want.
// The value parameter contains the value that a property is assigned to. For example, when you write user.name = "Elon Musk",
// the value parameter contains the assigned value "Elon Musk".

// 2. Backing Field (field)
// Backing field helps you refer to the property
// inside the getter and setter methods.
// This is required because if you use the property
// directly inside the getter or setter then you’ll
// run into a recursive call which will generate
// a StackOverflowError.
