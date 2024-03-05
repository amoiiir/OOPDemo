package com.example.oopdemo

import android.util.Log

open class Car {
    var maxSpeed = 30

    open fun start(){
        Log.i("Mytag", "Car is starting...")
        Log.i("Mytag", "Max speed is $maxSpeed")
    }
}