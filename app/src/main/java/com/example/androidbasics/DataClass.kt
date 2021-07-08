package com.example.androidbasics

data class User(val id: Long, var name: String)

fun main(){
    val user1 = User(1,"Sanskrita")
    user1.name="Disha"
    val user2 = User(1,"Disha")
    println(user1==user2)
    println("User Details: $user1")
    val updatedUser=user1.copy(name = "Sans")
    println(user1)
    println(updatedUser.component1())
    println(updatedUser.component2())
    val(id,name)=updatedUser
    println("id = $id and name = $name")
}