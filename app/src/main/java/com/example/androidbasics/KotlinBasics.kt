package com.example.androidbasics


    fun main () {

        //Integer Types
        val myByte :Byte = 1
        val myShort :Short = 125
        val myInt :Int = 123456
        val myLong :Long = 128_2686_7567

        //Floating point numbers
        val myFloat :Float = 12.25F
        val myDouble :Double = 124.5657678678

        //Boolean
        var isSunny = true
        isSunny = false

        //Characters
        var letter: Char ='A'

        //String
        var name:String= "Sanskrita"
        var firstChar = name[0]
        var lastChar = name[name.length-1]
        print("Hello $name!")

        // val is immutable whereas var is mutable

        // But we don't need to define explicitly, Kotlin will automatically assume if it's integer or string or etc
        var ag = 18 //integer
        var school = "SCOPE" //String

        //Arithmetic operators(+,-,*,/,%)
        var result = 5+3
        var a=5.0
        var b=3
        var resultDouble : Double = a/b

        //Comparison operators(==,!=,<,>,<=,>=)
        //Assignment operators(+=,*=,/=,%=)
        //Increment and Decrement operators(++,--)

        //When syntax -> alternative to if else if structure and more like switch statement
        var season =3
        when(season){
            1 -> println("Spring")
            2 -> println("Summer")
            3 -> {
                println("Fall")
                println("Autumn")
            }
            4 -> println("Winter")
            else -> println("Invalid Season")
        }

        var month = 3
        when(month){
            in 3..5 -> println("Spring")
            in 6..8 -> println("Summer")
            in 9..11 -> {
            println("Fall")
            println("Autumn")
        }
            12,1,2 -> println("Winter")
            else -> println("Invalid Month")
        }

        var age =21
        when(age){
            !in 0..20 -> println("You may drink")
            in 18..20 -> println("You may vote")
            16,17 -> println("You may drive")
            else -> println("You are too young")
        }

        var x : Any = 13.67
        when(x){
            is Int -> println("$x is an integer")
            is Double -> println("$x is a double")
            is String -> println("$x is a string")
            else -> println("$x is none of the above")
        }

        //while loop
        val condition=true
        while(condition){
            //Code to be executed
        }

        //do while loop
        do{
           //Code to be executed
        }while (condition)

        //for loop
        for (num in 1..10)
            println("$num")
        for (num in 1 until 10)
            println("$num")
        for(i in 10 downTo 1 step 2)
            println("$i")
    }