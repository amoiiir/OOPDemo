package com.example.oopdemo

import android.util.Log

class Driver(name : String, credit : Int) {

    private var totalCredit = 50
    //field variable
    private var driverName = name
    private val car = Car()


    //other ways of initializing empty string, rather than using this method,
    //use lateinit

    //to assign constructor parameter value, we use init
    init {
        totalCredit += credit
        driverName = name
        car.maxSpeed = 150
    }

    fun showDetails(){
        Log.i("MyTag", "name of the driver is $driverName with $totalCredit credit")
    }
}