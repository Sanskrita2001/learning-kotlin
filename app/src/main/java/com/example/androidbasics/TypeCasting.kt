package com.example.androidbasics

fun main(){
    val stringList:List<String> = listOf("Sans","Disha","Atrijo","Anu")
    val mixedList:List<Any> = listOf("Sans",1,23.0,'A')

    for (value in mixedList){
        if (value is Int)
            println("$value is integer")
        else if (value is Double)
            println("$value is double")
        else if (value is String)
            println("$value is string")
    }

}