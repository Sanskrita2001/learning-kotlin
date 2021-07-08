package com.example.androidbasics

import android.app.ApplicationErrorReport
import java.time.temporal.TemporalAmount

//interface
interface Drivable{
    val MaxSpeed:Double
    fun drive(): String
    fun brake(){
        println("The driver is braking")
    }
}
//Super/Parent/Base Class of Electric Car
open class  Car(override val MaxSpeed:Double,val name: String,val brand:String):Drivable{
    open var range:Double=0.0
    fun extendRange(amount: Double){
        if (amount>0)
            range+=amount
    }

    override fun drive(): String ="The driver is driving interface"
    open fun drive(distance:Double){
        println("Drove for $distance Kms")
    }
}

//Sub/Child/Derived Class of ElectricCar
class ElectricCar(MaxSpeed:Double,name: String, brand:String, val batteryInfo: Double):Car(MaxSpeed,name,brand){
    override var range =batteryInfo*6
    override fun drive(distance:Double){
        println("Drove for $distance Kms")
    }
    override fun drive():String{
        return "Drove for $range Kms"
    }

    override fun brake() {
        super.brake()
        println("brake inside electric car")
    }
}

fun main(){
    var myCar = Car(200.0,"A3","Audi")
    var myECar = ElectricCar(240.0,"S-Model","Tesla",80.0)
    myECar.extendRange(200.0)

    myECar.drive()
    myECar.brake()
    myCar.brake()
    //Polymorphism
    myCar.drive(200.0)
    myECar.drive(500.0)
}

//Abstract class can hold everything interface have
// and additionally can have fields and constructor ,
//therefore we can properly hold states in abstract class