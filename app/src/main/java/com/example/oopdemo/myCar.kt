package com.example.oopdemo

import android.util.Log

class myCar : Car(), SpeedController{
    override fun start(){
        Log.i("Mytag", "This is myCar status .... Brand id is ${getBrandId()}")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }

    override fun decelerate() {
        TODO("Not yet implemented")
    }
}